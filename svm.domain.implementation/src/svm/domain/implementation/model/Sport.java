package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ISport;
import svm.persistence.abstraction.model.ISportEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Sport implements ISport,IHasEntity<ISportEntity> {

    ISportEntity sportEntity;

    public Sport(ISportEntity sportEntity) {
        this.sportEntity = sportEntity;
    }

    @Override
    public String getName() {
        return sportEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.sportEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return sportEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) {
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
    public void setDepartment(IDepartment department) {
        this.sportEntity.setDepartment(((Department)department).getEntity());

    }

    @Override
    public ISportEntity getEntity() {
        return sportEntity;
    }
}
