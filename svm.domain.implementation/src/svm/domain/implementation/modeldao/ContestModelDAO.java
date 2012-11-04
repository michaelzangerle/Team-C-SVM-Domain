package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modeldao.IContestModelDAO;
import svm.domain.implementation.model.Contest;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContestEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class ContestModelDAO extends AbstractModelDAO<IContest, IContestEntity> implements IContestModelDAO {

    public ContestModelDAO() {
        super(PersistenceFacade.getContestDAO());
    }

    @Override
    protected Contest wrapObject(IContestEntity Entity) {
        return new Contest(Entity);
    }
}
