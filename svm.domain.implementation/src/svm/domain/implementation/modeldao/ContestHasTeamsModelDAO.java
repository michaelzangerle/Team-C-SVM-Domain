package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IContestHasTeam;
import svm.domain.abstraction.modeldao.IContestModelDAO;
import svm.domain.abstraction.modeldao.IContestsHasTeamsModelDao;
import svm.domain.implementation.model.Contest;
import svm.domain.implementation.model.ContestHasTeam;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;

/**
 * Projectteam: Team C
 * Date: 03.11.12
 */
public class ContestHasTeamsModelDAO extends AbstractModelDAO<IContestHasTeam, IContestsHasTeamsEntity> implements IContestsHasTeamsModelDao {

    public ContestHasTeamsModelDAO() {
        super(PersistenceFacade.getContestHasTeamsDAO());
    }

    @Override
    protected ContestHasTeam wrapObject(IContestsHasTeamsEntity entity) {
        return new ContestHasTeam(entity);
    }

}