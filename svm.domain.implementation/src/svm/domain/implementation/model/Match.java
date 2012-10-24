package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Match {
    String name;
    Date start;
    Date end;
    Boolean cancelled;
    String remarks;
    ContactDetail contactDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ContactDetail getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetail contactDetails) {
        this.contactDetails = contactDetails;
    }
}
