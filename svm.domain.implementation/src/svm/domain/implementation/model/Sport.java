package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ISport;
import svm.persistence.abstraction.model.ISportEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Sport implements ISport, IHasEntity<ISportEntity> {

    ISportEntity sportEntity;

    public Sport(ISportEntity sportEntity) {
        this.sportEntity = sportEntity;
    }

    @Override
    public String getName() {
        return sportEntity.getName();
    }

    @Override
    public void setName(String name) throws DomainAttributeException {
        if (name == null || name.isEmpty())
            throw new DomainAttributeException("name is empty");
        this.sportEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return sportEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) throws DomainAttributeException {
        if (alias == null || alias.isEmpty())
            throw new DomainAttributeException("alias is empty");
        this.sportEntity.setAlias(alias);
    }

    @Override
    public String getDescription() {
        return sportEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.sportEntity.setDescription(description);
    }

    @Override
    public Department getDepartment() {
        return new Department(sportEntity.getDepartment());

    }

    @Override
    public void setDepartment(IDepartment department) throws DomainAttributeException {
        if (department == null)
            throw new DomainAttributeException("department is null");
        this.sportEntity.setDepartment(((Department) department).getEntity());

    }

    @Override
    public ISportEntity getEntity() {
        return sportEntity;
    }

    @Override
    public boolean isNull() {
        return sportEntity == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sport that = (Sport) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
