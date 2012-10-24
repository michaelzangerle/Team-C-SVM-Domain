package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class TeamType {
    ITeamTypeEntity teamTypeEntity;

    public String getName() {
        return teamTypeEntity.name;
    }

    public void setName(String name) {
        this.teamTypeEntity.name = name;
    }

    public String getDescription() {
        return teamTypeEntity.description;
    }

    public void setDescription(String description) {
        this.teamTypeEntity.description = description;
    }
}
