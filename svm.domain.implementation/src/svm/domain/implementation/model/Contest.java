package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.persistence.abstraction.model.IContestEntity;

import java.util.Date;

/**
 * ProjectTeam
 * Date: 21.10.12
 */
public class Contest implements IContest, IHasEntity<IContestEntity> {
    IContestEntity contestEntity;

    public Contest(IContestEntity contestEntity){
        this.contestEntity = contestEntity;
    }

    @Override
    public String getName() {
        return contestEntity.getName();
    }

    @Override
    public void setName(String name) throws DomainAttributeException {
        if(name.equals(new String()))
            throw new DomainAttributeException("contest name is empty");
        this.contestEntity.setName(name);
    }

    @Override
    public Date getStart() {
        return contestEntity.getStart();
    }

    @Override
    public void setStart(Date start) {
        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setStart(new java.sql.Date(start.getTime()));
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(contestEntity.getContactDetails());
}

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.contestEntity.setContactDetails(((ContactDetails)contactDetails).getEntity());
    }

    @Override
    public Date getEnd() {
        return contestEntity.getEnd();
    }

    @Override
    public void setEnd(Date end) {
        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setEnd(new java.sql.Date(end.getTime()));
    }

    @Override
    public Float getFee() {
        return contestEntity.getFee();
    }

    @Override
    public void setFee(Float fee) {
        this.contestEntity.setFee(fee);
    }

    @Override
    public IContestEntity getEntity() {
        return this.contestEntity;
    }
}
