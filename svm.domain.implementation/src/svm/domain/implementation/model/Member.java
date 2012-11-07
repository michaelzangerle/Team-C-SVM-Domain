package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.domain.implementation.dateClasses.CalendarStartDate;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.*;

import java.util.*;

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
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            title = "";

        this.memberEntity.setTitle(title);
    }

    @Override
    public String getFirstName() {
        return memberEntity.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) throws DomainAttributeException {
        if (firstName == null || firstName.isEmpty())
            throw new DomainAttributeException("First Name is empty");
        this.memberEntity.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return memberEntity.getLastName();

    }

    @Override
    public void setLastName(String lastName) throws DomainAttributeException {
        if (lastName == null || lastName.isEmpty())
            throw new DomainAttributeException("LastName is empty");
        this.memberEntity.setLastName(lastName);
    }

    @Override
    public String getSocialNumber() {
        return memberEntity.getSocialNumber();
    }

    @Override
    public void setSocialNumber(String socialNumber) throws DomainAttributeException {
        if (socialNumber == null || socialNumber.isEmpty())
            throw new DomainAttributeException("FirstName is empty");
        this.memberEntity.setSocialNumber(socialNumber);
    }

    @Override
    public Date getBirthDate() {
        return memberEntity.getBirthDate();
    }

    @Override
    public void setBirthDate(Date birthDate) throws DomainParameterCheckException {
        if (birthDate == null)
            throw new DomainParameterCheckException("Birthday is null");
        if (!birthDate.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("Birthday before 1900" + birthDate.toString());

        //TODO Check if conversion from util date to sql date is correct
        this.memberEntity.setBirthDate(new java.sql.Date(birthDate.getTime()));
    }

    @Override
    public String getGender() {
        return memberEntity.getGender();
    }

    @Override
    public void setGender(String gender) throws DomainAttributeException, DomainParameterCheckException {
        if (gender == null || gender.isEmpty())
            throw new DomainAttributeException("Gender is empty");
        String genderUpperCase = gender.toUpperCase();
        if (!genderUpperCase.equals("F") && !genderUpperCase.equals("M"))
            throw new DomainParameterCheckException("Wrong Gender. Allow is F for female and M für male. Yours was: " + genderUpperCase);
        //TODO Look if Database can handle String gender
        this.memberEntity.setGender(gender);
    }

    @Override
    public Date getEntryDate() {
        return memberEntity.getEntryDate();
    }

    @Override
    public void setEntryDate(Date entryDate) throws DomainParameterCheckException {
        if (entryDate == null)
            throw new DomainParameterCheckException("EntryDate is null");
        if (!entryDate.after(CalendarStartDate.getCalenderStartDate()))
            throw new DomainParameterCheckException("EntryDate before 1900" + entryDate.toString());
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
        if (userName == null || userName.isEmpty())
            throw new DomainAttributeException("Username is empty");
        this.memberEntity.setUsername(userName);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(memberEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException {
        if (contactDetails == null)
            throw new DomainAttributeException("ContactDetails is empty");
        this.memberEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public Double getFee() {
        //TODO Fee get from File
        if (getAge() <= 18)
            return 20.0;
        else
            return 30.0;
    }

    @Override
    public void setPaidCurrentYear() throws NoSessionFoundException, IllegalAccessException, InstantiationException {

        IMemberFeeEntity enity = PersistenceFacade.getMemberFeeDAO().generateObject();
        enity.setAmount(Float.valueOf(String.valueOf(getFee())));

        enity.setMember(memberEntity);

        enity.setDate(new java.sql.Date(new Date().getTime()));
        memberEntity.getFees().add(enity);

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

            Calendar tmp = Calendar.getInstance();
            tmp.setTime(fee.getDate());
            Integer fee_year = tmp.get(Calendar.YEAR);

            if (fee_year.equals(year))
                paidYet += fee.getAmount();

        }
        int i = Double.compare(paidYet, getFee());
        if (i >= 0)
            return true;
        return false;
    }

    @Override
    public Integer getAge() {
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

    @Override
    public List<IDepartmentsHasMembers> getDepartmentsHasMembers() {
        List<IDepartmentsHasMembers> result = new LinkedList<IDepartmentsHasMembers>();
        for (IDepartmentsHasMembersEntity entity : this.memberEntity.getDepartmentHasMembers()) {
            result.add(new DepartmentsHasMembers(entity));
        }
        return result;
    }

    @Override
    public List<IContestHasTeam> getContestsHasTeamsForPerson() {
        List<IContestHasTeam> allContestsHasTeams = new LinkedList<IContestHasTeam>();
        List<ITeamEntity> teams = memberEntity.getTeamForContactPerson();
        for (ITeamEntity team : teams) {
            ITeam t = new Team(team);
            List<IContestHasTeam> contestHasTeams = t.getContest();
            allContestsHasTeams.addAll(contestHasTeams);
        }

        return allContestsHasTeams;
    }


    @Override
    public List<ISubTeamsHasMembers> getSubTeamsHasMembersForPerson() {
        List<ISubTeamsHasMembers> allSubTeamsOfMember = new LinkedList<ISubTeamsHasMembers>();

        for (ISubTeamsHasMembersEntity entity : memberEntity.getSubTeamHasMember()) {
            allSubTeamsOfMember.add(new SubTeamsHasMembers(entity));
        }
        return allSubTeamsOfMember;
    }

    @Override
    public Boolean isIn(IDepartment department) {
        for (IDepartmentsHasMembers d : getDepartmentsHasMembers()) {
            if (d.getDepartment().getName().equals(department.getName())) return true;
        }
        return false;
    }

    @Override
    public Boolean isIn(IUserPrivilege.Privileges privilege) {
        for (IUserPrivilegeEntity d : memberEntity.getPrivileges()) {
            if (privilege.equals(IUserPrivilege.Privileges.get(d.getAlias()))) return true;
        }
        return false;
    }
}
