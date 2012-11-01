package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modeldao.ISubTeamModelDAO;
import svm.domain.implementation.model.SubTeam;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.ISubTeamEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class SubTeamModelDAO extends AbstractModelDAO<ISubTeam, ISubTeamEntity> implements ISubTeamModelDAO {
    public SubTeamModelDAO() {
        super(PersistenceFacade.getSubTeamDAO());
    }


    @Override
    protected ISubTeam wrapObject(ISubTeamEntity Entity) {
        return new SubTeam(Entity);
    }
}
