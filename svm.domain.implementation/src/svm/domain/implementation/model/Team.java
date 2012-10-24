package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modelInterfaces.ISport;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.domain.abstraction.modelInterfaces.ITeamType;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Team implements ITeam {
    ITeamEntity teamEntity;

    public Team(ITeamEntity teamEntity) {
        this.teamEntity = teamEntity;
    }

    @Override
    public String getName() {
        return teamEntity.name;
    }

    @Override
    public void setName(String name) {
        this.teamEntity.name = name;
    }

    @Override
    public String getAlias() {
        return teamEntity.alias;
    }

    @Override
    public void setAlias(String alias) {
        this.teamEntity.alias = alias;
    }

    @Override
    public Date getFounded() {
        return teamEntity.founded;
    }

    @Override
    public void setFounded(Date founded) {
        this.teamEntity.founded = founded;
    }

    @Override
    public ISport getSport() {
        return teamEntity.sport;
    }

    @Override
    public void setSport(ISport ISport) {
        this.teamEntity.sport = ISport;
    }

    @Override
    public ITeamType getTeamType() {
        return teamEntity.teamType;
    }

    @Override
    public void setTeamType(ITeamType ITeamType) {
        this.teamEntity.teamType = ITeamType;
    }

    @Override
    public IMember getContactPerson() {
        return teamEntity.contactPerson;
    }

    @Override
    public void setContactPerson(IMember contactPerson) {
        this.teamEntity.contactPerson = contactPerson;
    }
}
