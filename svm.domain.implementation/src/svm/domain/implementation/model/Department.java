package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IDepartment;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Department implements IDepartment {
    IDepartmentEntity departmentEntity;

    public Department(IDepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    @Override
    public String getName() {
        return departmentEntity.name;
    }

    @Override
    public void setName(String name) {
        this.departmentEntity.name = name;
    }

    @Override
    public String getAlias() {
        return departmentEntity.alias;
    }

    @Override
    public void setAlias(String alias) {
        this.departmentEntity.alias = alias;
    }

    @Override
    public String getDescription() {
        return departmentEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.departmentEntity.description = description;
    }

    @Override
    public IContactDetails getContactDetails() {
        return departmentEntity.contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetails IContactDetails) {
        this.departmentEntity.contactDetails = IContactDetails;
    }
}
