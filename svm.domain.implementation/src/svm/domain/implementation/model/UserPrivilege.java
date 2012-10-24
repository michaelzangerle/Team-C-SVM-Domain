package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class UserPrivilege {
    IUserPrivilegeEntity userPrivilegeEntity;

    public String getName() {
        return userPrivilegeEntity.name;
    }

    public void setName(String name) {
        this.userPrivilegeEntity.name = name;
    }

    public String getDescription() {
        return userPrivilegeEntity.description;
    }

    public void setDescription(String description) {
        this.userPrivilegeEntity.description = description;
    }
}
