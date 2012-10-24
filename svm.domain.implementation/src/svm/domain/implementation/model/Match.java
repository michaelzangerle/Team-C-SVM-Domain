package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IMatch;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Match implements IMatch {
    IMatchEntity matchEntity;

    public Match(IMatchEntity matchEntity) {
        this.matchEntity = matchEntity;
    }

    @Override
    public String getName() {
        return matchEntity.name;
    }

    @Override
    public void setName(String name) {
        this.matchEntity.name = name;
    }

    @Override
    public Date getStart() {
        return matchEntity.start;
    }

    @Override
    public void setStart(Date start) {
        this.matchEntity.start = start;
    }

    @Override
    public Date getEnd() {
        return matchEntity.end;
    }

    @Override
    public void setEnd(Date end) {
        this.matchEntity.end = end;
    }

    @Override
    public Boolean getCancelled() {
        return matchEntity.cancelled;
    }

    @Override
    public void setCancelled(Boolean cancelled) {
        this.matchEntity.cancelled = cancelled;
    }

    @Override
    public String getRemarks() {
        return matchEntity.remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.matchEntity.remarks = remarks;
    }

    @Override
    public IContactDetails getContactDetails() {
        return matchEntity.contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetails IContactDetails) {
        this.matchEntity.contactDetails = IContactDetails;
    }
}
