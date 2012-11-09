package svm.domain.implementation.modeldao;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.domain.abstraction.modeldao.ISubTeamModelDAO;
import svm.domain.implementation.model.SubTeam;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.ISubTeamEntity;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class SubTeamModelDAO extends AbstractModelDAO<ISubTeam, ISubTeamEntity> implements ISubTeamModelDAO {
    public SubTeamModelDAO() {
        super(PersistenceFacade.getSubTeamDAO());
    }

    public List<ISubTeamEntity> getEntities(Integer sessionId, ITeam team, IContest contest) throws NoSessionFoundException {
        CompareObject[] compares = new CompareObject[2];
        compares[0] = new CompareObject("team", FindQualifiers.EQUALS, String.valueOf(((IHasEntity) team).getEntity().getId()));
        compares[1] = new CompareObject("contest", FindQualifiers.EQUALS, String.valueOf(((IHasEntity) contest).getEntity().getId()));
        return getDAO().find(sessionId, compares);
    }

    @Override
    public ISubTeam get(Integer sessionId, ITeam team, IContest contest) throws NoSessionFoundException, DomainException, NotSupportedException, IllegalAccessException, InstantiationException {
        List<ISubTeamEntity> result = getEntities(sessionId, team, contest);
        if (result.size() == 0) {
            ISubTeam subTeam = generateObject(sessionId);
            subTeam.setTeam(team);
            subTeam.setContest(contest);
            subTeam.setName(team.getName() + " - " + contest.getName());
            return subTeam;
        } else if (result.size() == 1) {
            return wrapObject(result.get(0));
        } else {
            throw new DomainException("To many SubTeams for Team and Contest found");
        }
    }


    @Override
    protected ISubTeam wrapObject(ISubTeamEntity Entity) {
        return new SubTeam(Entity);
    }
}
