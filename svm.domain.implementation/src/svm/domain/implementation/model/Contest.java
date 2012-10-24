package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contest {
    String name;
    Date start;
    Date end;
    ContactDetail contactDetails;
    Float fee;

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

    public ContactDetail getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetail contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }
}
