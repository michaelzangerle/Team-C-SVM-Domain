package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;

/**
 * Projectteam
 * Date: 21.10.12
 */

public class ContactDetails implements IContactDetails, IContactDetails {
    IContactDetailsEntity contactDetailsEntity;

    public ContactDetails(IContactDetailsEntity contactDetailsEntity) {
        this.contactDetailsEntity = contactDetailsEntity;
    }

    @Override
    public String getPhone2() {
        return contactDetailsEntity.getPhone2();
    }

    @Override
    public void setPhone2(String phone2) {
        this.contactDetailsEntity.phone2 = phone2;
    }

    @Override
    public String getEmail1() {
        return contactDetailsEntity.email1;
    }

    @Override
    public void setEmail1(String email1) {
        this.contactDetailsEntity.email1 = email1;
    }

    @Override
    public String getEmail2() {
        return contactDetailsEntity.email2;
    }

    @Override
    public void setEmail2(String email2) {
        this.contactDetailsEntity.email2 = email2;
    }

    @Override
    public String getFax() {
        return contactDetailsEntity.fax;
    }

    @Override
    public void setFax(String fax) {
        this.contactDetailsEntity.fax = fax;
    }

    @Override
    public String getStreet() {
        return contactDetailsEntity.street;
    }

    @Override
    public void setStreet(String street) {
        this.contactDetailsEntity.street = street;
    }

    @Override
    public String getStreetNumber() {
        return contactDetailsEntity.streetNumber;
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        this.contactDetailsEntity.streetNumber = streetNumber;
    }

    @Override
    public int getLocation() {
        return contactDetailsEntity.location;
    }

    @Override
    public void setLocation(int location) {
        this.contactDetailsEntity.location = location;
    }

    @Override
    public Long getCoordLat() {
        return contactDetailsEntity.coordLat;
    }

    @Override
    public void setCoordLat(Long coordLat) {
        this.contactDetailsEntity.coordLat = coordLat;
    }

    @Override
    public Long getCoordLong() {
        return contactDetailsEntity.coordLong;
    }

    @Override
    public void setCoordLong(Long coordLong) {
        this.contactDetailsEntity.coordLong = coordLong;
    }

    @Override
    public String getPhone1() {
        return contactDetailsEntity.phone1;
    }

    @Override
    public void setPhone1(String phone1) {
        this.contactDetailsEntity.phone1 = phone1;
    }
}
