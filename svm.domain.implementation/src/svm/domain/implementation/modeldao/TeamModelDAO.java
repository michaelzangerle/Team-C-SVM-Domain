package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.domain.abstraction.modeldao.ITeamModelDAO;
import svm.domain.implementation.model.Team;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.abstraction.model.ITeamEntity;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;

import java.util.LinkedList;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class TeamModelDAO extends AbstractModelDAO<ITeam, ITeamEntity> implements ITeamModelDAO {
    public TeamModelDAO() {
        super(PersistenceFacade.getTeamDAO());
    }

    @Override
    protected ITeam wrapObject(ITeamEntity entity) {
        if (entity.getContestsHasTeams() == null) {
            entity.setContestsHasTeams(new LinkedList<IContestsHasTeamsEntity>());
        }
        if (entity.getSubTeams() == null) {
            entity.setSubTeams(new LinkedList<ISubTeamEntity>());
        }
        if (entity.getTeamsHasMembers() == null) {
            entity.setTeamsHasMembers(new LinkedList<ITeamsHasMembersEntity>());
        }
        return new Team(entity);
    }
}
