package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.persistence.abstraction.model.IMemberEntity;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 21.10.12
 */
public class Member implements IMember {

    IMemberEntity memberEntity;

    public Member(IMemberEntity memberEntity) {
        this.memberEntity = memberEntity;
    }

    @Override
    public String getTitle() {
        return memberEntitiy.title;
    }

    @Override
    public void setTitle(String title) {
        this.memberEntitiy.title = title;
    }

    @Override
    public String getFirstName() {
        return memberEntitiy.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.memberEntitiy.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return memberEntitiy.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.memberEntitiy.lastName = lastName;
    }

    @Override
    public String getSocialNumber() {
        return memberEntitiy.socialNumber;
    }

    @Override
    public void setSocialNumber(String socialNumber) {
        this.memberEntitiy.socialNumber = socialNumber;
    }

    @Override
    public Date getBirthDate() {
        return memberEntitiy.birthDate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.memberEntitiy.birthDate = birthDate;
    }

    @Override
    public Character getGender() {
        return memberEntitiy.gender;
    }

    @Override
    public void setGender(Character gender) {
        this.memberEntitiy.gender = gender;
    }

    @Override
    public Date getEntryDate() {
        return memberEntitiy.entryDate;
    }

    @Override
    public void setEntryDate(Date entryDate) {
        this.memberEntitiy.entryDate = entryDate;
    }

    @Override
    public String getAvatar() {
        return memberEntitiy.avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.memberEntitiy.avatar = avatar;
    }

    @Override
    public String getUrl() {
        return memberEntitiy.url;
    }

    @Override
    public void setUrl(String url) {
        this.memberEntitiy.url = url;
    }

    @Override
    public String getUserName() {
        return memberEntitiy.userName;
    }

    @Override
    public void setUserName(String userName) {
        this.memberEntitiy.userName = userName;
    }

    @Override
    public IContactDetails getContactDetails() {
        return memberEntitiy.contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.memberEntitiy.contactDetails = contactDetails;
    }

    @Override
    public Double getFee() {
        return memberEntitiy.fee;
    }

    @Override
    public void setFee(Double fee) {
        this.memberEntitiy.fee = fee;
    }

}
