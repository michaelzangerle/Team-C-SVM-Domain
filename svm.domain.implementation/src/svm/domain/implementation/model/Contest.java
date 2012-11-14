package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.domain.implementation.dateClasses.CalendarStartDate;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ProjectTeam
 * Date: 21.10.12
 */
public class Contest implements IContest, IHasEntity<IContestEntity> {
    IContestEntity contestEntity;

    public Contest(IContestEntity contestEntity) {
        this.contestEntity = contestEntity;
    }

    @Override
    public String getName() {
        return contestEntity.getName();
    }

    @Override
    public void setName(String name) throws DomainAttributeException {
        if (name == null || name.isEmpty())
            throw new DomainAttributeException("contest name is empty");
        this.contestEntity.setName(name);
    }

    @Override
    public Date getStart() {
        return contestEntity.getStart();
    }

    @Override
    public void setStart(Date start) throws DomainParameterCheckException {

        if (start == null)
            throw new DomainParameterCheckException("start is null");

        if (!start.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("start before 1900" + start.toString());

        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setStart(new java.sql.Date(start.getTime()));
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(contestEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException {
        if (contactDetails == null)
            throw new DomainAttributeException("contact Details is null");
        this.contestEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public Date getEnd() {
        return contestEntity.getEnd();
    }

    @Override
    public void setEnd(Date end) throws DomainParameterCheckException {
        if (end == null)
            throw new DomainParameterCheckException("End is null");
        if (!end.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("End before 1900" + end.toString());
        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setEnd(new java.sql.Date(end.getTime()));
    }

    @Override
    public Float getFee() {
        return contestEntity.getFee();
    }

    @Override
    public void setFee(Float fee) throws DomainParameterCheckException, DomainAttributeException {
        if (fee == null)
            throw new DomainAttributeException("fee is null");
        if (fee < 0)
            throw new DomainParameterCheckException("Fee must be greater or equals zero. Actual: " + fee);
        this.contestEntity.setFee(fee);
    }

    @Override
    public IContestEntity getEntity() {
        return this.contestEntity;
    }

    @Override
    public void addExternalTeam(IExternalTeam team) throws DomainException {
        if (team == null)
            throw new DomainAttributeException("team is null");

        for (IContestsHasExternalTeamsEntity entity : contestEntity.getContestsHasExternalTeams()) {
            if (entity.getExternalTeam().equals(((ExternalTeam) team).getEntity()))
                throw new DomainParameterCheckException("Team all already added");


        }

        IContestsHasExternalTeamsEntity c = null;
        try {
            c = PersistenceFacade.getContestHasExternalTeamsDAO().generateObject();
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        } catch (NoSessionFoundException e) {
            throw new DomainException(e.getMessage(), e);
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        }
        c.setPaid(0f);
        c.setContest(getEntity());
        c.setExternalTeam(((ExternalTeam) team).getEntity());


        contestEntity.getContestsHasExternalTeams().add(c);
    }

    @Override
    public void removeExternalTeam(IExternalTeam team) throws DomainException {
        if (team == null)
            throw new DomainAttributeException("team is null");

        for (IContestsHasExternalTeamsEntity entity : contestEntity.getContestsHasExternalTeams()) {
            if (entity.getExternalTeam().equals(((ExternalTeam) team).getEntity()))
                contestEntity.getContestsHasExternalTeams().remove(entity);


        }
        //throw new DomainParameterCheckException("Team could not be found");

    }

    @Override
    public void removeInternalTeam(ITeam team) throws DomainException {
        if (team == null)
            throw new DomainAttributeException("team is null");

        IContestsHasTeamsEntity toRemove = null;

        for (IContestsHasTeamsEntity entity : contestEntity.getContestsHasTeams()) {
            if (entity.getTeam().getName().equals(((Team) team).getEntity().getName()))
                toRemove = entity;

        }
        if (toRemove != null) {
            contestEntity.getContestsHasTeams().remove(toRemove);
            System.out.println("Team to remove: " + toRemove.getTeam().getName());
        }

        //throw new DomainParameterCheckException("Team could not be found");

    }

    @Override
    public void addInternalTeam(ITeam team) throws DomainException {

        if (team == null)
            throw new DomainAttributeException("team is null");


        for (IContestsHasTeamsEntity entity : contestEntity.getContestsHasTeams()) {
            if (entity.getTeam().equals(((Team) team).getEntity()))
                throw new DomainParameterCheckException("Team all already added");
        }

        IContestsHasTeamsEntity c = null;
        try {
            c = PersistenceFacade.getContestHasTeamsDAO().generateObject();
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        } catch (NoSessionFoundException e) {
            throw new DomainException(e.getMessage(), e);
        } catch (NotSupportedException e) {
            e.printStackTrace();
            throw new DomainException(e.getMessage(), e);
        }
        c.setPaid(false);
        c.setContest(getEntity());
        c.setTeam(((Team) team).getEntity());


        contestEntity.getContestsHasTeams().add(c);
    }


    public void addMatch(IMatch match) throws DomainException {
        if (match == null)
            throw new DomainAttributeException("match ist null");

        List<IMatchEntity> matches = contestEntity.getMatches();
        if (matches.contains(((Match) match).getEntity()))
            throw new DomainParameterCheckException("match already added");

        contestEntity.getMatches().add(((Match) match).getEntity());

    }

    public void removeMatch(IMatch match) throws DomainException {
        if (match == null)
            throw new DomainAttributeException("match ist null");

        List<IMatchEntity> matches = contestEntity.getMatches();
        if (matches.contains(((Match) match).getEntity()))
            contestEntity.getMatches().remove(((Match) match).getEntity());
        else
            throw new DomainParameterCheckException("match not found");

    }

    @Override
    public List<IMatch> getMatches() {
        List<IMatch> result = new LinkedList<IMatch>();
        for (IMatchEntity entity : this.contestEntity.getMatches()) {
            result.add(new Match(entity));
        }
        return result;
    }

    @Override
    public List<ITeam> getTeams() {
        List<ITeam> result = new LinkedList<ITeam>();
        for (IContestsHasTeamsEntity entity : contestEntity.getContestsHasTeams()) {
            result.add(new Team(entity.getTeam()));
        }
        return result;
    }

    @Override
    public List<IExternalTeam> getExternalTeams() {
        List<IExternalTeam> result = new LinkedList<IExternalTeam>();
        for (IContestsHasExternalTeamsEntity entity : contestEntity.getContestsHasExternalTeams()) {
            result.add(new ExternalTeam(entity.getExternalTeam()));
        }
        return result;
    }

    @Override
    public ISport getSport() {
        return new Sport(contestEntity.getSport());
    }

    @Override
    public void setSport(ISport sport) {
        contestEntity.setSport(((IHasEntity<ISportEntity>) sport).getEntity());
    }

    @Override
    public boolean getFinished() {
        return contestEntity.getFinished();
    }

    @Override
    public void setFinished(boolean finished) {
        contestEntity.setFinished(finished);
    }

    @Override
    public boolean isNull() {
        return this.contestEntity == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contest that = (Contest) o;

        if (this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
