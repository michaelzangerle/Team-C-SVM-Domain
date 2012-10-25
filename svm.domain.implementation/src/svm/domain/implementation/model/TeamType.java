package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.ITeamType;
import svm.persistence.abstraction.model.ITeamTypeEntity;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class TeamType implements ITeamType {
    ITeamTypeEntity teamTypeEntity;

    public TeamType(ITeamTypeEntity teamTypeEntity) {
        this.teamTypeEntity = teamTypeEntity;
    }

    @Override
    public String getName() {
        return teamTypeEntity.name;
    }

    @Override
    public void setName(String name) {
        this.teamTypeEntity.name = name;
    }

    @Override
    public String getDescription() {
        return teamTypeEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.teamTypeEntity.description = description;
    }
}
