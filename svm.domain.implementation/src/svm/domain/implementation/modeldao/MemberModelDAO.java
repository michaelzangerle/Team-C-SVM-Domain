package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modeldao.IMemberModelDAO;
import svm.domain.implementation.model.Member;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMemberEntity;

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
    protected IMember wrapObject(IMemberEntity Entity) {
        return new Member(Entity);
    }

    @Override
    public List<IMember> get(Integer sessionId, String firstName, String lastName, IDepartment department) throws NoSessionFoundException {
        CompareObject[] compares = new CompareObject[3];
        compares[0] = new CompareObject("firstName", FindQualifiers.LIKE, "%" + firstName + "%");
        compares[2] = new CompareObject("lastName", FindQualifiers.LIKE, "%" + lastName + "%");
        compares[2] = new CompareObject("department", FindQualifiers.LIKE, String.valueOf(((IHasEntity) department).getEntity().getId()));

        List<IMember> result = new LinkedList<IMember>();
        for (IMemberEntity member : getDAO().find(sessionId, compares)) {
            result.add(wrapObject(member));
        }
        return result;
    }
}
