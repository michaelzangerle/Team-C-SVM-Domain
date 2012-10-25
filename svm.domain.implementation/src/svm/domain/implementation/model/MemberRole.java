package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IMemberRole;
import svm.persistence.abstraction.model.IMemberRoleEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class MemberRole implements IMemberRole {

    IMemberRoleEntity memberRoleEntity;

    public MemberRole(IMemberRoleEntity memberRoleEntity) {
        this.memberRoleEntity = memberRoleEntity;
    }

    @Override
    public String getName() {
        return memberRoleEntity.name;
    }

    @Override
    public void setName(String name) {
        this.memberRoleEntity.name = name;
    }

    @Override
    public String getDescription() {
        return memberRoleEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.memberRoleEntity.description = description;
    }
}
