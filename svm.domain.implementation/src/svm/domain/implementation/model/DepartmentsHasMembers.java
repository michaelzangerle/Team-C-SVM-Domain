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
}