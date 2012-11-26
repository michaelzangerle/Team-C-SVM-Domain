package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modeldao.IMemberModelDAO;
import svm.domain.implementation.model.Member;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public class MemberModelDAO extends AbstractModelDAO<IMember, IMemberEntity> implements IMemberModelDAO {
    public MemberModelDAO() {
        super(PersistenceFacade.getMemberDAO());
    }

    @Override
    protected IMember wrapObject(IMemberEntity entity) {
        if (entity.getDepartmentHasMembers() == null) {
            entity.setDepartmentHasMembers(new LinkedList<IDepartmentsHasMembersEntity>());
        }
        if (entity.getFees() == null) {
            entity.setFees(new LinkedList<IMemberFeeEntity>());
        }
        if (entity.getSubTeamHasMember() == null) {
            entity.setSubTeamHasMember(new LinkedList<ISubTeamsHasMembersEntity>());
        }
        if (entity.getTeamForContactPerson() == null) {
            entity.setTeamForContactPerson(new LinkedList<ITeamEntity>());
        }
        if (entity.getTeamsHasMembers() == null) {
            entity.setTeamsHasMembers(new LinkedList<ITeamsHasMembersEntity>());
        }
        return new Member(entity);
    }

    public List<IMemberEntity> getEntities(Integer sessionId, String firstName, String lastName) throws NoSessionFoundException {
        CompareObject[] compares = new CompareObject[2];
        compares[0] = new CompareObject("firstName", FindQualifiers.LIKE, "%" + firstName + "%");
        compares[1] = new CompareObject("lastName", FindQualifiers.LIKE, "%" + lastName + "%");
        return getDAO().find(sessionId, compares);
    }

    public List<IMemberEntity> getEntities(Integer sessionId, String userName) throws NoSessionFoundException {
        CompareObject[] compares = new CompareObject[1];
        compares[0] = new CompareObject("userName", FindQualifiers.EQUALS, userName);
        return getDAO().find(sessionId, compares);
    }

    @Override
    public List<IMember> get(Integer sessionId, String userName) throws NoSessionFoundException {
        List<IMember> result = new LinkedList<IMember>();
        for (IMemberEntity member : getEntities(sessionId, userName)) {
            result.add(wrapObject(member));
        }
        return result;
    }

    @Override
    public List<IMember> get(Integer sessionId, String firstName, String lastName) throws NoSessionFoundException {
        List<IMember> result = new LinkedList<IMember>();
        for (IMemberEntity member : getEntities(sessionId, firstName, lastName)) {
            result.add(wrapObject(member));
        }
        return result;
    }

    @Override
    public List<IMember> get(Integer sessionId, String firstName, String lastName, IDepartment department) throws NoSessionFoundException {
        List<IMember> result = new LinkedList<IMember>();
        for (IMemberEntity member : getEntities(sessionId, firstName, lastName)) {
            IMember m = wrapObject(member);
            if (m.isIn(department)) {
                result.add(m);
            }
        }
        return result;
    }

    @Override
    public List<IMember> get(Integer sessionId, Date birthDateFrom, Date birthDateTo) throws NoSessionFoundException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        CompareObject compare = new CompareObject("birthDate", FindQualifiers.BETWEEN, "'" + format.format(birthDateFrom) + "' AND '" + format.format(birthDateTo) + "'");

        List<IMember> result = new LinkedList<IMember>();
        for (IMemberEntity member : getDAO().find(sessionId, compare)) {
            result.add(wrapObject(member));
        }
        return result;
    }
}
