package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IUserPrivilege;
import svm.persistence.abstraction.model.IUserPrivilegeEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class UserPrivilege implements IUserPrivilege, IHasEntity<IUserPrivilegeEntity> {
    IUserPrivilegeEntity userPrivilegeEntity;

    public UserPrivilege(IUserPrivilegeEntity userPrivilegeEntity) {
        this.userPrivilegeEntity = userPrivilegeEntity;
    }

    @Override
    public String getName() {
        return userPrivilegeEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.userPrivilegeEntity.setName(name);
    }

    @Override
    public String getDescription() {
        return userPrivilegeEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.userPrivilegeEntity.setDescription(description);
    }

    @Override
    public Privileges getAlias() {
        return Privileges.get(this.userPrivilegeEntity.getAlias());
    }

    @Override
    public IUserPrivilegeEntity getEntity() {
        return userPrivilegeEntity;
    }

    @Override
    public boolean isNull() {
        return userPrivilegeEntity == null;
    }

    @Override
    public Integer getUID() {
        return this.userPrivilegeEntity.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPrivilege that = (UserPrivilege) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
