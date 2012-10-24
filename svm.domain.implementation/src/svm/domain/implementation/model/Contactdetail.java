package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */

public class ContactDetail {
    IContactDetailsEntity contactDetailsEntity;

    public ContactDetail(IContactDetailsEntity contactDetailsEntity) {
        this.contactDetailsEntity = contactDetailsEntity;
    }

    public String getPhone2() {
        return contactDetailsEntity.getPhone2();
    }

    public void setPhone2(String phone2) {
        this.contactDetailsEntity.phone2 = phone2;
    }

    public String getEmail1() {
        return contactDetailsEntity.email1;
    }

    public void setEmail1(String email1) {
        this.contactDetailsEntity.email1 = email1;
    }

    public String getEmail2() {
        return contactDetailsEntity.email2;
    }

    public void setEmail2(String email2) {
        this.contactDetailsEntity.email2 = email2;
    }

    public String getFax() {
        return contactDetailsEntity.fax;
    }

    public void setFax(String fax) {
        this.contactDetailsEntity.fax = fax;
    }

    public String getStreet() {
        return contactDetailsEntity.street;
    }

    public void setStreet(String street) {
        this.contactDetailsEntity.street = street;
    }

    public String getStreetNumber() {
        return contactDetailsEntity.streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.contactDetailsEntity.streetNumber = streetNumber;
    }

    public int getLocation() {
        return contactDetailsEntity.location;
    }

    public void setLocation(int location) {
        this.contactDetailsEntity.location = location;
    }

    public Long getCoordLat() {
        return contactDetailsEntity.coordLat;
    }

    public void setCoordLat(Long coordLat) {
        this.contactDetailsEntity.coordLat = coordLat;
    }

    public Long getCoordLong() {
        return contactDetailsEntity.coordLong;
    }

    public void setCoordLong(Long coordLong) {
        this.contactDetailsEntity.coordLong = coordLong;
    }

    public String getPhone1() {
        return contactDetailsEntity.phone1;
    }

    public void setPhone1(String phone1) {
        this.contactDetailsEntity.phone1 = phone1;
    }
}
