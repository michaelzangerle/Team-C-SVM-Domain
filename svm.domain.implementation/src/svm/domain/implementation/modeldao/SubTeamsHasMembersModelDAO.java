package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ISubTeamsHasMembers;
import svm.domain.abstraction.modeldao.ISubTeamsHasMembersModelDAO;
import svm.domain.implementation.model.SubTeamsHasMembers;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class SubTeamsHasMembersModelDAO extends AbstractModelDAO<ISubTeamsHasMembers, ISubTeamsHasMembersEntity> implements ISubTeamsHasMembersModelDAO {
    public SubTeamsHasMembersModelDAO() {
        super(PersistenceFacade.getSubTeamsHasMembersDAO());
    }

    @Override
    protected ISubTeamsHasMembers wrapObject(ISubTeamsHasMembersEntity entity) {
        return new SubTeamsHasMembers(entity);
    }
}
