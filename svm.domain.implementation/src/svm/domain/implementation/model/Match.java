package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Match {
    IMatchEntity matchEntity;

    public Match(IMatchEntity matchEntity) {
        this.matchEntity = matchEntity;
    }

    public String getName() {
        return matchEntity.name;
    }

    public void setName(String name) {
        this.matchEntity.name = name;
    }

    public Date getStart() {
        return matchEntity.start;
    }

    public void setStart(Date start) {
        this.matchEntity.start = start;
    }

    public Date getEnd() {
        return matchEntity.end;
    }

    public void setEnd(Date end) {
        this.matchEntity.end = end;
    }

    public Boolean getCancelled() {
        return matchEntity.cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.matchEntity.cancelled = cancelled;
    }

    public String getRemarks() {
        return matchEntity.remarks;
    }

    public void setRemarks(String remarks) {
        this.matchEntity.remarks = remarks;
    }

    public ContactDetails getContactDetails() {
        return matchEntity.contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.matchEntity.contactDetails = contactDetails;
    }
}
