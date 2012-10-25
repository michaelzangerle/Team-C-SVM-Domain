package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.ISport;
import svm.persistence.abstraction.model.ISportEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Sport implements ISport {

    ISportEntity sportEntity;

    public Sport(ISportEntity sportEntity) {
        this.sportEntity = sportEntity;
    }

    @Override
    public String getName() {
        return sportEntity.name;
    }

    @Override
    public void setName(String name) {
        this.sportEntity.name = name;
    }

    @Override
    public String getAlias() {
        return sportEntity.alias;
    }

    @Override
    public void setAlias(String alias) {
        this.sportEntity.alias = alias;
    }

    @Override
    public String getDescription() {
        return sportEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.sportEntity.description = description;
    }

    @Override
    public Department getDepartment() {
        return sportEntity.department;
    }

    @Override
    public void setDepartment(IDepartment department) {
        this.sportEntity.department = department;
    }

}
