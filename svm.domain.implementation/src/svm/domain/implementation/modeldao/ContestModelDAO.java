package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modeldao.IContestModelDAO;
import svm.domain.implementation.model.Contest;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.IContestsHasExternalTeamsEntity;
import svm.persistence.abstraction.model.IMatchEntity;

import java.util.LinkedList;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class ContestModelDAO extends AbstractModelDAO<IContest, IContestEntity> implements IContestModelDAO {

    public ContestModelDAO() {
        super(PersistenceFacade.getContestDAO());
    }

    @Override
    protected IContest wrapObject(IContestEntity entity) {
        IContest contest = new Contest(entity);
        if (entity.getContestsHasExternalTeams() == null) {
            entity.setContestsHasExternalTeams(new LinkedList<IContestsHasExternalTeamsEntity>());
        }
        if (entity.getContestsHasTeams() == null) {
            entity.setContestsHasExternalTeams(new LinkedList<IContestsHasExternalTeamsEntity>());
        }
        if (entity.getMatches() == null) {
            entity.setMatches(new LinkedList<IMatchEntity>());
        }
        return contest;
    }
}
