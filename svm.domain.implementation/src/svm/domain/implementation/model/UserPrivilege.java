package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IUserPrivilege;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class UserPrivilege implements IUserPrivilege {
    IUserPrivilegeEntity userPrivilegeEntity;

    @Override
    public String getName() {
        return userPrivilegeEntity.name;
    }

    @Override
    public void setName(String name) {
        this.userPrivilegeEntity.name = name;
    }

    @Override
    public String getDescription() {
        return userPrivilegeEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.userPrivilegeEntity.description = description;
    }
}
