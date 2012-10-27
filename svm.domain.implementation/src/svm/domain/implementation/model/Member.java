package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.persistence.abstraction.model.IMemberEntity;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 21.10.12
 */
public class Member implements IMember,IHasEntity<IMemberEntity> {

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
        this.memberEntity.setTitle(title);
    }

    @Override
    public String getFirstName() {
        return memberEntity.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        this.memberEntity.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return memberEntity.getLastName();

    }

    @Override
    public void setLastName(String lastName) {
        this.memberEntity.setLastName(lastName);
    }

    @Override
    public String getSocialNumber() {
        return memberEntity.getSocialNumber();
    }

    @Override
    public void setSocialNumber(String socialNumber) {
        this.memberEntity.setSocialNumber(socialNumber);
    }

    @Override
    public Date getBirthDate() {
        return memberEntity.getBirthDate();
    }

    @Override
    public void setBirthDate(Date birthDate) {
        //TODO Check if conversion from util date to sql date is correct
        this.memberEntity.setBirthDate( new java.sql.Date(birthDate.getTime()));
    }

    @Override
    public String getGender() {
        return memberEntity.getGender();
    }

    @Override
    public void setGender(String gender) {
        this.memberEntity.setGender(gender);
    }

    @Override
    public Date getEntryDate() {
        return memberEntity.getEntryDate();
    }

    @Override
    public void setEntryDate(Date entryDate) {
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
    public void setUserName(String userName) {
        this.memberEntity.setUsername(userName);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(memberEntity.getContactDetails());
    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.memberEntity.setContactDetails(((ContactDetails)contactDetails).getEntity());
    }

    @Override
    public Double getFee() {
        return memberEntity.getFee();
    }

    @Override
    public void setFee(Double fee) {
        this.memberEntity.setFee(fee);
    }

    @Override
    public IMemberEntity getEntity() {
        return memberEntity;
    }
}
