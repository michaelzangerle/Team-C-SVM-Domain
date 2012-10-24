package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Sport {

    ISportEntity sportEntity;

    public Sport(ISportEntity sportEntity) {
        this.sportEntity = sportEntity;
    }

    public String getName() {
        return sportEntity.name;
    }

    public void setName(String name) {
        this.sportEntity.name = name;
    }

    public String getAlias() {
        return sportEntity.alias;
    }

    public void setAlias(String alias) {
        this.sportEntity.alias = alias;
    }

    public String getDescription() {
        return sportEntity.description;
    }

    public void setDescription(String description) {
        this.sportEntity.description = description;
    }

    public Department getDepartment() {
        return sportEntity.department;
    }

    public void setDepartment(Department department) {
        this.sportEntity.department = department;
    }
}
