package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.*;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Match implements IMatch, IHasEntity<IMatchEntity> {
    IMatchEntity matchEntity;

    public Match(IMatchEntity matchEntity) {
        this.matchEntity = matchEntity;
    }

    @Override
    public String getName() {
        return matchEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.matchEntity.setName(name);
    }

    @Override
    public Date getStart() {
        return matchEntity.getStart();
    }

    @Override
    public void setStart(Date start) {
        // TODO Check if Timestamp is correct
        // Schaut so aus als ob wir keine util.date aus der DB bekommen und sql.date kann keine Zeit.
        // Versuchen wirs so.
        this.matchEntity.setStart(new Timestamp(start.getTime()));
    }

    @Override
    public Date getEnd() {
        return matchEntity.getEnd();
    }

    @Override
    public void setEnd(Date end) {
        this.matchEntity.setEnd(new Timestamp(end.getTime()));
    }

    @Override
    public Boolean getCancelled() {
        return matchEntity.isCanceled();
    }

    @Override
    public void setCancelled(Boolean cancelled) {
        this.matchEntity.setCanceled(cancelled);
    }

    @Override
    public String getRemarks() {
        return matchEntity.getRemarks();
    }

    @Override
    public void setRemarks(String remarks) {
        this.matchEntity.setRemarks(remarks);
    }

    @Override
    public String getDescription() {
        return this.matchEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.matchEntity.setDescription(description);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(matchEntity.getContactDetails());
    }

    @Override
    public void setMatchType(IMatchType matchType) {
        this.matchEntity.setMatchType(((IHasEntity<IMatchTypeEntity>) matchType).getEntity());
    }

    @Override
    public IMatchType getMatchType() {
        return new MatchType(this.matchEntity.getMatchType());
    }


    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.matchEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public void setContestants(ITeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        this.matchEntity.setHomeInternal(((IHasEntity<ITeamEntity>) home).getEntity());
        this.matchEntity.setAwayInternal(((IHasEntity<ITeamEntity>) away).getEntity());
    }

    @Override
    public void setContestants(IExternalTeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        this.matchEntity.setHomeExternal(((IHasEntity<IExternalTeamEntity>) home).getEntity());
        this.matchEntity.setAwayInternal(((IHasEntity<ITeamEntity>) away).getEntity());
    }

    @Override
    public void setContestants(ITeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        this.matchEntity.setHomeInternal(((IHasEntity<ITeamEntity>) home).getEntity());
        this.matchEntity.setAwayExternal(((IHasEntity<IExternalTeamEntity>) away).getEntity());
    }

    @Override
    public void setContestants(IExternalTeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        this.matchEntity.setHomeExternal(((IHasEntity<IExternalTeamEntity>) home).getEntity());
        this.matchEntity.setAwayExternal(((IHasEntity<IExternalTeamEntity>) away).getEntity());
    }

    @Override
    public void setResult(Integer home, Integer away) throws DomainException, NoSessionFoundException, InstantiationException, IllegalAccessException {
        this.matchEntity.setHomeResult(home);
        this.matchEntity.setAwayResult(away);
    }

    @Override
    public ITeam getHomeInternal() {
        return new Team(this.matchEntity.getHomeInternal());
    }

    @Override
    public IExternalTeam getHomeExternal() {
        return new ExternalTeam(this.matchEntity.getHomeExternal());
    }

    @Override
    public ITeam getAwayInternal() {
        return new Team(this.matchEntity.getAwayInternal());
    }

    @Override
    public IExternalTeam getAwayExternal() {
        return new ExternalTeam(this.matchEntity.getAwayExternal());
    }

    @Override
    public Integer getHomeResult() {
        return this.matchEntity.getHomeResult();
    }

    @Override
    public Integer getAwayResult() {
        return this.matchEntity.getAwayResult();
    }

    @Override
    public void setHomeResult(Integer value) {
        this.matchEntity.setHomeResult(value);
    }

    @Override
    public void setAwayResult(Integer value) {
        this.matchEntity.setAwayResult(value);
    }

    @Override
    public IMatchEntity getEntity() {
        return matchEntity;
    }

    @Override
    public IContest getContest() {
        return new Contest(matchEntity.getContest());
    }

    @Override
    public void setContest(IContest contest) {
        matchEntity.setContest(((IHasEntity<IContestEntity>) contest).getEntity());
    }

    @Override
    public boolean isNull() {
        return matchEntity == null;
    }
}
