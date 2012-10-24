package svm.domain.implementation.model;

import java.util.Date;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Member {

    IMemberEntitiy memberEntitiy;

    public Member(IMemberEntitiy memberEntitiy) {
        this.memberEntitiy = memberEntitiy;
    }

    public String getTitle() {
        return memberEntitiy.title;
    }

    public void setTitle(String title) {
        this.memberEntitiy.title = title;
    }

    public String getFirstName() {
        return memberEntitiy.firstName;
    }

    public void setFirstName(String firstName) {
        this.memberEntitiy.firstName = firstName;
    }

    public String getLastName() {
        return memberEntitiy.lastName;
    }

    public void setLastName(String lastName) {
        this.memberEntitiy.lastName = lastName;
    }

    public String getSocialNumber() {
        return memberEntitiy.socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.memberEntitiy.socialNumber = socialNumber;
    }

    public Date getBirthDate() {
        return memberEntitiy.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.memberEntitiy.birthDate = birthDate;
    }

    public Character getGender() {
        return memberEntitiy.gender;
    }

    public void setGender(Character gender) {
        this.memberEntitiy.gender = gender;
    }

    public Date getEntryDate() {
        return memberEntitiy.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.memberEntitiy.entryDate = entryDate;
    }

    public String getAvatar() {
        return memberEntitiy.avatar;
    }

    public void setAvatar(String avatar) {
        this.memberEntitiy.avatar = avatar;
    }

    public String getUrl() {
        return memberEntitiy.url;
    }

    public void setUrl(String url) {
        this.memberEntitiy.url = url;
    }

    public String getUserName() {
        return memberEntitiy.userName;
    }

    public void setUserName(String userName) {
        this.memberEntitiy.userName = userName;
    }

    public ContactDetails getContactDetails() {
        return memberEntitiy.contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.memberEntitiy.contactDetails = contactDetails;
    }

    public Double getFee() {
        return memberEntitiy.fee;
    }

    public void setFee(Double fee) {
        this.memberEntitiy.fee = fee;
    }

}
