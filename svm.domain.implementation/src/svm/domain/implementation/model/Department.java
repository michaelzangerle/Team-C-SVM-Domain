package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Department {
    IDepartmentEntity departmentEntity;

    public Department(IDepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    public String getName() {
        return departmentEntity.name;
    }

    public void setName(String name) {
        this.departmentEntity.name = name;
    }

    public String getAlias() {
        return departmentEntity.alias;
    }

    public void setAlias(String alias) {
        this.departmentEntity.alias = alias;
    }

    public String getDescription() {
        return departmentEntity.description;
    }

    public void setDescription(String description) {
        this.departmentEntity.description = description;
    }

    public ContactDetails getContactDetails() {
        return departmentEntity.contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.departmentEntity.contactDetails = contactDetails;
    }
}
