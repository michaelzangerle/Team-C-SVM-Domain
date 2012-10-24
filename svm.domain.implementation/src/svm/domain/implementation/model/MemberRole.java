package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class MemberRole {

    IMemberRoleEntity memberRoleEntity;

    public MemberRole(IMemberRoleEntity memberRoleEntity) {
        this.memberRoleEntity = memberRoleEntity;
    }

    public String getName() {
        return memberRoleEntity.name;
    }

    public void setName(String name) {
        this.memberRoleEntity.name = name;
    }

    public String getDescription() {
        return memberRoleEntity.description;
    }

    public void setDescription(String description) {
        this.memberRoleEntity.description = description;
    }
}
