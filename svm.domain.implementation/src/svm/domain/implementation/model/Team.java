package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.abstraction.model.ITeamEntity;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class Team implements ITeam, IHasEntity<ITeamEntity> {
    ITeamEntity teamEntity;

    public Team(ITeamEntity teamEntity) {
        this.teamEntity = teamEntity;
    }

    @Override
    public String getName() {
        return teamEntity.getName();
    }

    @Override
    public void setName(String name) throws DomainAttributeException {
        if (name == null || name.isEmpty())
            throw new DomainAttributeException("name is empty");
        this.teamEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return teamEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) throws DomainAttributeException {
        if (alias == null || alias.isEmpty())
            throw new DomainAttributeException("alias is empty");
        this.teamEntity.setAlias(alias);
    }

    @Override
    public Date getFounded() {
        return teamEntity.getFounded();
    }

    @Override
    public void setFounded(Date founded) throws DomainParameterCheckException {
        if (founded == null)
            throw new DomainParameterCheckException("Year is null");
        if (founded.getYear() < 1500)
            throw new DomainParameterCheckException("Year smaller than 1500 " + founded.getYear());
        //TODO Check if conversion from util date to sql date is correct
        this.teamEntity.setFounded(new java.sql.Date(founded.getTime()));
    }

    @Override
    public ISport getSport() {
        return new Sport(teamEntity.getSport());
    }

    @Override
    public void setSport(ISport sport) throws DomainAttributeException {
        if (sport == null)
            throw new DomainAttributeException("sport is null");
        this.teamEntity.setSport(((Sport) sport).getEntity());

    }

    @Override
    public ITeamType getTeamType() {
        return new TeamType(teamEntity.getTeamType());
    }

    @Override
    public void setTeamType(ITeamType teamType) throws DomainAttributeException {
        if (teamType == null)
            throw new DomainAttributeException("team type is null");
        this.teamEntity.setTeamType(((TeamType) teamType).getEntity());
    }

    @Override
    public IMember getContactPerson() {
        return new Member(teamEntity.getContactPerson());
    }

    @Override
    public void setContactPerson(IMember contactPerson) throws DomainAttributeException {
        if (contactPerson == null)
            throw new DomainAttributeException("contact person is null");
        this.teamEntity.setContactPerson(((Member) contactPerson).getEntity());
    }

    @Override
    public List<IContestHasTeam> getContest() {
        List<IContestHasTeam> contests = new LinkedList<IContestHasTeam>();
        List<IContestsHasTeamsEntity> contestEntities = teamEntity.getContestsHasTeams();
        for (IContestsHasTeamsEntity contestEntity : contestEntities) {
            if (contestEntity.getContest().getStart().after(new Date()) || contestEntity.getContest().getStart().equals(new Date()))
                contests.add((new ContestHasTeam(contestEntity)));
        }
        return contests;
    }

    @Override
    public Boolean isMember(IMember member) {
        for (ITeamsHasMembersEntity entity : teamEntity.getTeamsHasMembers()) {
            if (entity.getMember().getId() == ((IHasEntity) member).getEntity().getId()) return true;
        }
        return false;
    }

    @Override
    public List<IMember> getMembers() {
        List<IMember> members = new LinkedList<IMember>();
        for (ITeamsHasMembersEntity entity : teamEntity.getTeamsHasMembers()) {
            members.add(new Member(entity.getMember()));
        }
        return members;
    }

    @Override
    public ITeamEntity getEntity() {
        return teamEntity;
    }

    @Override
    public boolean isNull() {
        return teamEntity == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team that = (Team) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
