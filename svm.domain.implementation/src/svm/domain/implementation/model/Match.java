package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMatch;
import svm.persistence.abstraction.model.IMatchEntity;

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
    public IContactDetails getContactDetails() {
        return new ContactDetails(matchEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.matchEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public IMatchEntity getEntity() {
        return matchEntity;
    }
}
