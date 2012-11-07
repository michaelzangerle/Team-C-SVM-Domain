package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
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
    public void setName(String name) throws DomainAttributeException {
        if (name == null || name.isEmpty())
            throw new DomainAttributeException("name is empty");
        this.departmentEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return departmentEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) throws DomainAttributeException {
        if (alias == null || alias.isEmpty())
            throw new DomainAttributeException("alias is empty");
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
    public void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException {
        if (contactDetails == null)
            throw new DomainAttributeException("contact detail is null");
        this.departmentEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public IDepartmentEntity getEntity() {
        return departmentEntity;
    }

    public Boolean equals(IDepartment obj) {
        return obj.equals(obj);
    }
}
