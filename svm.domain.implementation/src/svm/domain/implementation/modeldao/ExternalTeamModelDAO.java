package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IExternalTeam;
import svm.domain.abstraction.modeldao.IExternalTeamModelDAO;
import svm.domain.implementation.model.ExternalTeam;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.IDAO;
import svm.persistence.abstraction.model.IExternalTeamEntity;

/**
 * Projectteam: Team C
 * Date: 06.11.12
 */
public class ExternalTeamModelDAO extends AbstractModelDAO<IExternalTeam, IExternalTeamEntity> implements IExternalTeamModelDAO {

    public ExternalTeamModelDAO(IDAO<IExternalTeamEntity> dao) {
        super(PersistenceFacade.getExternalTeamDAO());
    }

    @Override
    protected IExternalTeam wrapObject(IExternalTeamEntity Entity) {
        return new ExternalTeam(Entity);
    }
}
