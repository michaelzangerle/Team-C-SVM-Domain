package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contest {
    IContestEntity contestEntity;

    public (IContestEntity contestEntity){
        this.contestEntity = contestEntity;
    }

    public String getName() {
        return contestEntity.name;
    }

    public void setName(String name) {
        this.contestEntity.name = name;
    }

    public Date getStart() {
        return contestEntity.start;
    }

    public void setStart(Date start) {
        this.contestEntity.start = start;
    }

    public ContactDetails getContactDetails() {
        return contestEntity.contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contestEntity.contactDetails = contactDetails;
    }

    public Date getEnd() {
        return contestEntity.end;
    }

    public void setEnd(Date end) {
        this.contestEntity.end = end;
    }

    public Float getFee() {
        return contestEntity.fee;
    }

    public void setFee(Float fee) {
        this.contestEntity.fee = fee;
    }
}
