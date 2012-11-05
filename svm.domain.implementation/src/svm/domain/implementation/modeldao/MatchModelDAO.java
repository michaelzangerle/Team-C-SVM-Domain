package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IMatch;
import svm.domain.abstraction.modeldao.IMatchModelDAO;
import svm.domain.implementation.model.Match;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IMatchEntity;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public class MatchModelDAO extends AbstractModelDAO<IMatch, IMatchEntity> implements IMatchModelDAO {
    public MatchModelDAO() {
        super(PersistenceFacade.getMatchDAO());
    }

    @Override
    protected IMatch wrapObject(IMatchEntity entity) {
        return new Match(entity);
    }
}
