package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import svm.persistence.abstraction.exceptions.NotSupportedException;
import java.util.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMember extends IModel {
    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName) throws DomainAttributeException;

    String getLastName();

    void setLastName(String lastName) throws DomainAttributeException;

    String getSocialNumber();

    void setSocialNumber(String socialNumber) throws DomainAttributeException;

    Date getBirthDate();

    void setBirthDate(Date birthDate) throws DomainParameterCheckException;

    String getGender();

    void setGender(String gender) throws DomainAttributeException, DomainParameterCheckException;

    Date getEntryDate();

    void setEntryDate(Date entryDate) throws DomainParameterCheckException;

    String getAvatar();

    void setAvatar(String avatar);

    String getUrl();

    void setUrl(String url);

    String getUserName();

    void setUserName(String userName) throws DomainAttributeException;

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException;

    Double getFee();

    boolean hasPaidFee(Integer year) throws DomainParameterCheckException;

    public List<IContestHasTeam> getContestsHasTeamsForPerson();

    List<IDepartmentsHasMembers> getDepartmentsHasMembers();

    Boolean isIn(IDepartment department);

    Integer getAge();

    List<ISubTeamsHasMembers> getSubTeamsHasMembersForPerson();

    void setPaidCurrentYear() throws NoSessionFoundException, IllegalAccessException, InstantiationException, NotSupportedException;

    Boolean isIn(IUserPrivilege.Privileges privilege);

    void removePrivilege(IUserPrivilege privilege) throws DomainParameterCheckException, DomainAttributeException;

    void addPrivilege(IUserPrivilege privilege) throws DomainParameterCheckException, DomainAttributeException, NoSessionFoundException, IllegalAccessException, InstantiationException;
}
