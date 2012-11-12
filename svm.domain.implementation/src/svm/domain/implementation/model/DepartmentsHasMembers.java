package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IDepartmentsHasMembers;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.persistence.abstraction.model.IDepartmentsHasMembersEntity;

// TODO Domain Logic Thomas

/**
 * ProjectTeam: Team C
 * Date: 01.11.12
 */
public class DepartmentsHasMembers implements IHasEntity<IDepartmentsHasMembersEntity>, IDepartmentsHasMembers {

    private IDepartmentsHasMembersEntity entity;

    public DepartmentsHasMembers(IDepartmentsHasMembersEntity entity) {
        this.entity = entity;
    }

    public IDepartment getDepartment() {
        return new Department(entity.getDepartment());
    }

    @Override
    public IDepartmentsHasMembersEntity getEntity() {
        return entity;
    }

    @Override
    public boolean isNull() {
        return entity == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentsHasMembers that = (DepartmentsHasMembers) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
