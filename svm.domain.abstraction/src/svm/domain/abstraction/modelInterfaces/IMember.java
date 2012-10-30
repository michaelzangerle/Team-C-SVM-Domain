package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMember extends IModel {
    String getTitle();

    void setTitle(String title) throws DomainAttributeException;

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

    void setAvatar(String avatar) throws DomainAttributeException;

    String getUrl();

    void setUrl(String url) throws DomainAttributeException;

    String getUserName();

    void setUserName(String userName);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails);

    Double getFee();

    void setFee(Double fee);

    boolean hasPaidFee(Integer year) throws DomainParameterCheckException;
}
