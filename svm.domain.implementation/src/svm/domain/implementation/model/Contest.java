package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contest implements svm.domain.abstraction.modelInterfaces.IContest {
    IContestEntity contestEntity;

    public (IContestEntity contestEntity){
        this.contestEntity = contestEntity;
    }

    @Override
    public String getName() {
        return contestEntity.name;
    }

    @Override
    public void setName(String name) {
        this.contestEntity.name = name;
    }

    @Override
    public Date getStart() {
        return contestEntity.start;
    }

    @Override
    public void setStart(Date start) {
        this.contestEntity.start = start;
    }

    @Override
    public IContactDetails getContactDetails() {
        return contestEntity.contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetails IContactDetails) {
        this.contestEntity.contactDetails = IContactDetails;
    }

    @Override
    public Date getEnd() {
        return contestEntity.end;
    }

    @Override
    public void setEnd(Date end) {
        this.contestEntity.end = end;
    }

    @Override
    public Float getFee() {
        return contestEntity.fee;
    }

    @Override
    public void setFee(Float fee) {
        this.contestEntity.fee = fee;
    }
}
