package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.domain.abstraction.modeldao.ITeamModelDAO;
import svm.domain.implementation.model.Team;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.ITeamEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class TeamModelDAO extends AbstractModelDAO<ITeam, ITeamEntity> implements ITeamModelDAO {
    public TeamModelDAO() {
        super(PersistenceFacade.getTeamDAO());
    }

    @Override
    protected ITeam wrapObject(ITeamEntity Entity) {
        return new Team(Entity);
    }
}
