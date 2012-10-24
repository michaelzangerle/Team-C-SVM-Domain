package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Team {
    ITeamEntity teamEntity;

    public Team(ITeamEntity teamEntity) {
        this.teamEntity = teamEntity;
    }

    public String getName() {
        return teamEntity.name;
    }

    public void setName(String name) {
        this.teamEntity.name = name;
    }

    public String getAlias() {
        return teamEntity.alias;
    }

    public void setAlias(String alias) {
        this.teamEntity.alias = alias;
    }

    public Date getFounded() {
        return teamEntity.founded;
    }

    public void setFounded(Date founded) {
        this.teamEntity.founded = founded;
    }

    public Sport getSport() {
        return teamEntity.sport;
    }

    public void setSport(Sport sport) {
        this.teamEntity.sport = sport;
    }

    public TeamType getTeamType() {
        return teamEntity.teamType;
    }

    public void setTeamType(TeamType teamType) {
        this.teamEntity.teamType = teamType;
    }

    public Member getContactPerson() {
        return teamEntity.contactPerson;
    }

    public void setContactPerson(Member contactPerson) {
        this.teamEntity.contactPerson = contactPerson;
    }
}
