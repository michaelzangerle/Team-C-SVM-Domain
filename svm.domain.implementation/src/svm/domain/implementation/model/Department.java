package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.persistence.abstraction.model.IDepartmentEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Department implements IDepartment, IHasEntity<IDepartmentEntity> {
    IDepartmentEntity departmentEntity;

    public Department(IDepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    @Override
    public String getName() {
        return departmentEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.departmentEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return departmentEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) {
        this.departmentEntity.setAlias(alias);
    }

    @Override
    public String getDescription() {
        return departmentEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.departmentEntity.setDescription(description);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(departmentEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.departmentEntity.setContactDetails(((ContactDetails)contactDetails).getEntity());
    }

    @Override
    public IDepartmentEntity getEntity() {
        return departmentEntity;
    }
}
