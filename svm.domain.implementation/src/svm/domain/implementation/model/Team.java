package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.*;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class Team implements ITeam,IHasEntity<ITeamEntity> {
    ITeamEntity teamEntity;

    public Team(ITeamEntity teamEntity) {
        this.teamEntity = teamEntity;
    }

    @Override
    public String getName() {
        return teamEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.teamEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return teamEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) {
        this.teamEntity.setAlias(alias);
    }

    @Override
    public Date getFounded() {
        return teamEntity.getFounded();
    }

    @Override
    public void setFounded(Date founded) {
        //TODO Check if conversion from util date to sql date is correct
        this.teamEntity.setFounded(new java.sql.Date(founded.getTime()));
    }

    @Override
    public ISport getSport() {
        return new Sport(teamEntity.getSport());
    }

    @Override
    public void setSport(ISport sport) {
        this.teamEntity.setSport(((Sport) sport).getEntity());

    }

    @Override
    public ITeamType getTeamType() {
        return new TeamType(teamEntity.getTeamType());
    }

    @Override
    public void setTeamType(ITeamType teamType) {
        this.teamEntity.setTeamType(((TeamType) teamType).getEntity());
    }

    @Override
    public IMember getContactPerson() {
        return new Member(teamEntity.getContactPerson());
    }

    @Override
    public void setContactPerson(IMember contactPerson) {
        this.teamEntity.setContactPerson(((Member) contactPerson).getEntity());
    }

    @Override
    public List<IContestHasTeam> getContest() {
        List<IContestHasTeam> contests=new LinkedList<IContestHasTeam>();
        List<IContestsHasTeamsEntity> contestEntities= teamEntity.getContestsHasTeams();
        for(IContestsHasTeamsEntity contestEntity: contestEntities)
        {
            //TODO Look after isConfirmed NullPointer ?
            if(!contestEntity.isConfirmed())
                contests.add((new ContestHasTeam(contestEntity)));
        }

        return  contests;
    }

    @Override
    public ITeamEntity getEntity() {
        return teamEntity;
    }
}
