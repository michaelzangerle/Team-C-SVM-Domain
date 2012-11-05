package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
    public IMatchTypeEntity getMatchType() {
        return this.matchEntity.getMatchType();
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.matchEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public void setContestants(ITeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        IContestantEntity e1 = PersistenceFacade.getContestantDAO().generateObject();
        e1.setInternalTeam(((IHasEntity<ITeamEntity>) home).getEntity());
        e1.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e1);

        IContestantEntity e2 = PersistenceFacade.getContestantDAO().generateObject();
        e2.setInternalTeam(((IHasEntity<ITeamEntity>) away).getEntity());
        e2.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e2);
    }

    @Override
    public void setContestants(IExternalTeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        IContestantEntity e1 = PersistenceFacade.getContestantDAO().generateObject();
        e1.setExternalTeam(((IHasEntity<IExternalTeamEntity>) home).getEntity());
        e1.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e1);

        IContestantEntity e2 = PersistenceFacade.getContestantDAO().generateObject();
        e2.setInternalTeam(((IHasEntity<ITeamEntity>) away).getEntity());
        e2.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e2);
    }

    @Override
    public void setContestants(ITeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        IContestantEntity e1 = PersistenceFacade.getContestantDAO().generateObject();
        e1.setInternalTeam(((IHasEntity<ITeamEntity>) home).getEntity());
        e1.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e1);

        IContestantEntity e2 = PersistenceFacade.getContestantDAO().generateObject();
        e2.setExternalTeam(((IHasEntity<IExternalTeamEntity>) away).getEntity());
        e2.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e2);
    }

    @Override
    public void setContestants(IExternalTeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException {
        IContestantEntity e1 = PersistenceFacade.getContestantDAO().generateObject();
        e1.setExternalTeam(((IHasEntity<IExternalTeamEntity>) home).getEntity());
        e1.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e1);

        IContestantEntity e2 = PersistenceFacade.getContestantDAO().generateObject();
        e2.setExternalTeam(((IHasEntity<IExternalTeamEntity>) away).getEntity());
        e2.getMatches().add(this.getEntity());
        matchEntity.getContestants().add(e2);
    }

    @Override
    public void addResult(Integer home, Integer away) throws DomainException, NoSessionFoundException, IllegalAccessException, InstantiationException {
        List<IContestantEntity> contestants = this.matchEntity.getContestants();
        if (contestants.size() != 2) throw new DomainException("No Contestants added");
        IContestantEntity homeContestant = contestants.get(0);
        IContestantEntity awayContestant = contestants.get(1);

        IPartResultEntity e1 = PersistenceFacade.getPartResultDAO().generateObject();
        e1.setResult(home);
        e1.setComment("");
        e1.setContestant(homeContestant);
        homeContestant.getPartResults().add(e1);

        IPartResultEntity e2 = PersistenceFacade.getPartResultDAO().generateObject();
        e2.setResult(away);
        e2.setComment("");
        e2.setContestant(awayContestant);
        awayContestant.getPartResults().add(e2);
    }

    @Override
    public IMatchEntity getEntity() {
        return matchEntity;
    }
}
