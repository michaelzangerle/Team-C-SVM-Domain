package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.implementation.dateClasses.CalendarStartDate;
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
    public void setStart(Date start) throws DomainParameterCheckException {
        if(!start.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("EntryDate before 1900"+start.toString());
        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setStart(new java.sql.Date(start.getTime()));
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(contestEntity.getContactDetails());
}

    @Override
    public void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException {
        if(contactDetails==null)
            throw new DomainAttributeException("contact Details is null");
        this.contestEntity.setContactDetails(((ContactDetails)contactDetails).getEntity());
    }

    @Override
    public Date getEnd() {
        return contestEntity.getEnd();
    }

    @Override
    public void setEnd(Date end) throws DomainParameterCheckException {
        if(!end.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("EntryDate before 1900"+end.toString());
        //TODO Check if conversion from util date to sql date is correct
        this.contestEntity.setEnd(new java.sql.Date(end.getTime()));
    }

    @Override
    public Float getFee() {
        return contestEntity.getFee();
    }

    @Override
    public void setFee(Float fee) throws DomainParameterCheckException, DomainAttributeException {
        if(fee==null)
            throw new DomainAttributeException("fee is null");
        if(fee<0)
            throw new DomainParameterCheckException("Fee must be greater or equals zero. Actual: "+fee);
        this.contestEntity.setFee(fee);
    }

    @Override
    public IContestEntity getEntity() {
        return this.contestEntity;
    }

    public void addTeam(IContestant contestant)
    {

    }


}
