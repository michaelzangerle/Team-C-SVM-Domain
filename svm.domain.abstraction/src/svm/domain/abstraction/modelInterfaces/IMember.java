package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMember extends IModel {
    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getSocialNumber();

    void setSocialNumber(String socialNumber);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    String getGender();

    void setGender(String gender);

    Date getEntryDate();

    void setEntryDate(Date entryDate);

    String getAvatar();

    void setAvatar(String avatar);

    String getUrl();

    void setUrl(String url);

    String getUserName();

    void setUserName(String userName);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails);

    Double getFee();

    void setFee(Double fee);
}
