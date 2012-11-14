package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ISport;
import svm.domain.abstraction.modeldao.ISportModelDAO;
import svm.domain.implementation.model.Sport;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.ISportEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class SportModelDAO extends AbstractModelDAO<ISport, ISportEntity> implements ISportModelDAO {
    public SportModelDAO() {
        super(PersistenceFacade.getSportDAO());
    }

    @Override
    protected ISport wrapObject(ISportEntity entity) {
        return new Sport(entity);
    }
}
