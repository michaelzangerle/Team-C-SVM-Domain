package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.domain.implementation.dateClasses.CalendarStartDate;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.IMemberFeeEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 21.10.12
 */
public class Member implements IMember, IHasEntity<IMemberEntity> {

    IMemberEntity memberEntity;

    public Member(IMemberEntity memberEntity) {
        this.memberEntity = memberEntity;
    }

    @Override
    public String getTitle() {
        return memberEntity.getTitle();
    }

    @Override
    public void setTitle(String title) throws DomainAttributeException {
        if(title.equals(new String()))
            throw new DomainAttributeException("Title is empty");
        this.memberEntity.setTitle(title);
    }

    @Override
    public String getFirstName() {
        return memberEntity.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) throws DomainAttributeException {
        if(firstName.equals(new String()))
            throw new DomainAttributeException("Title is empty");
        this.memberEntity.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return memberEntity.getLastName();

    }

    @Override
    public void setLastName(String lastName) throws DomainAttributeException {
        if(lastName.equals(new String()))
            throw new DomainAttributeException("Title is empty");
        this.memberEntity.setLastName(lastName);
    }

    @Override
    public String getSocialNumber() {
        return memberEntity.getSocialNumber();
    }

    @Override
    public void setSocialNumber(String socialNumber) throws DomainAttributeException {
        if(socialNumber.equals(new String()))
            throw new DomainAttributeException("Title is empty");
        this.memberEntity.setSocialNumber(socialNumber);
    }

    @Override
    public Date getBirthDate() {
        return memberEntity.getBirthDate();
    }

    @Override
    public void setBirthDate(Date birthDate) throws DomainParameterCheckException {
        if(!birthDate.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("Birthday before 1900"+birthDate.toString());

        //TODO Check if conversion from util date to sql date is correct
        this.memberEntity.setBirthDate(new java.sql.Date(birthDate.getTime()));
    }

    @Override
    public String getGender() {
        return memberEntity.getGender();
    }

    @Override
    public void setGender(String gender) throws DomainAttributeException, DomainParameterCheckException {
        if(gender.equals(new String()))
            throw new DomainAttributeException("Gender is empty");
        String genderUpperCase=gender.toUpperCase();
        if(!genderUpperCase.equals("F")||!genderUpperCase.equals("M"))
            throw new DomainParameterCheckException("Wrong Gender. Allow is F for female and M für male. Yours was: "+genderUpperCase);
        this.memberEntity.setGender(gender);
    }

    @Override
    public Date getEntryDate() {
        return memberEntity.getEntryDate();
    }

    @Override
    public void setEntryDate(Date entryDate) throws DomainParameterCheckException {
        if(!entryDate.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("EntryDate before 1900"+entryDate.toString());
        //TODO Check if conversion from util date to sql date is correct
        this.memberEntity.setEntryDate(new java.sql.Date(entryDate.getTime()));
    }

    @Override
    public String getAvatar() {

        return memberEntity.getAvatar();
    }

    @Override
    public void setAvatar(String avatar) {
        this.memberEntity.setAvatar(avatar);
    }

    @Override
    public String getUrl() {
        return memberEntity.getUrl();
    }

    @Override
    public void setUrl(String url) {
        this.memberEntity.setUrl(url);
    }

    @Override
    public String getUserName() {
        return memberEntity.getUsername();
    }

    @Override
    public void setUserName(String userName) throws DomainAttributeException {
        if(userName.equals(new String()))
            throw new DomainAttributeException("Username is empty");
        this.memberEntity.setUsername(userName);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(memberEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException {
        if(contactDetails==null)
            throw new DomainAttributeException("ContactDetails is empty");
        this.memberEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public Double getFee() {
        //TODO Fee get from File
        if(getAge()<=18)
            return 20.0;
         else
            return 30.0;
    }


    @Override
    public IMemberEntity getEntity() {
        return memberEntity;
    }

    @Override
    public boolean hasPaidFee(Integer year) throws DomainParameterCheckException {
        if (year < 1900)
            throw new DomainParameterCheckException("Year smaller than 1900 " + year);
        Double paidYet = 0.0;
        List<IMemberFeeEntity> fees = memberEntity.getFees();
        for (IMemberFeeEntity fee : fees) {
            Integer fee_year = fee.getDate().getYear();
            if (fee_year.equals(year))
                paidYet += fee.getAmount();

        }
        int i = Double.compare(paidYet, getFee());
        if (i >= 0)
            return true;
        return false;
    }

    public Integer getAge()
    {
        GregorianCalendar cal = new GregorianCalendar();
        int y, d, a;

        y = cal.get(cal.YEAR);
        d = cal.get(cal.DAY_OF_YEAR);
        cal.setTime(getBirthDate());
        a = y - cal.get(cal.YEAR);
        if (d < cal.get(cal.DAY_OF_YEAR)) {
            --a;
        }
        return (a);
    }

    public List<IContestHasTeam> getContestsForPerson()
    {
        List<IContestHasTeam> allNotConfirmedContest=new LinkedList<IContestHasTeam>();
         List<ITeamEntity> teams= memberEntity.getTeamForContactPerson();
         for(ITeamEntity team:teams)
         {
             ITeam t = new Team(team);
            List<IContestHasTeam> notConfirmedContest= t.getContest();
             allNotConfirmedContest.addAll(notConfirmedContest);
         }

        return allNotConfirmedContest;
    }
}
