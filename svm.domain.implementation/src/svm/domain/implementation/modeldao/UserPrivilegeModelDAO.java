package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IUserPrivilege;
import svm.domain.abstraction.modeldao.IUserPrivilegeModelDAO;
import svm.domain.implementation.model.UserPrivilege;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IUserPrivilegeEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class UserPrivilegeModelDAO extends AbstractModelDAO<IUserPrivilege, IUserPrivilegeEntity> implements IUserPrivilegeModelDAO {

    public UserPrivilegeModelDAO() {
        super(PersistenceFacade.getUserPrivilegeDAO());
    }

    @Override
    protected IUserPrivilege wrapObject(IUserPrivilegeEntity Entity) {
        return new UserPrivilege(Entity);
    }
}
