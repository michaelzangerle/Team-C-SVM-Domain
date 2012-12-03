package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMemberRole;
import svm.persistence.abstraction.model.IMemberRoleEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class MemberRole implements IMemberRole, IHasEntity<IMemberRoleEntity> {

    IMemberRoleEntity memberRoleEntity;

    public MemberRole(IMemberRoleEntity memberRoleEntity) {
        this.memberRoleEntity = memberRoleEntity;
    }

    @Override
    public String getName() {
        return memberRoleEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.memberRoleEntity.setName(name);
    }

    @Override
    public String getDescription() {
        return memberRoleEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.memberRoleEntity.setDescription(description);
    }

    @Override
    public IMemberRoleEntity getEntity() {
        return memberRoleEntity;
    }

    @Override
    public boolean isNull() {
        return memberRoleEntity == null;
    }

    @Override
    public Integer getUID() {
        return this.memberRoleEntity.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberRole that = (MemberRole) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
