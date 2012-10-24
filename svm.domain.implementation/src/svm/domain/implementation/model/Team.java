package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Team {
    String name;
    String alias;
    Date founded;
    Sport sport;
    TeamType teamType;
    Member contactPerson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getFounded() {
        return founded;
    }

    public void setFounded(Date founded) {
        this.founded = founded;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public TeamType getTeamType() {
        return teamType;
    }

    public void setTeamType(TeamType teamType) {
        this.teamType = teamType;
    }

    public Member getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Member contactPerson) {
        this.contactPerson = contactPerson;
    }
}
