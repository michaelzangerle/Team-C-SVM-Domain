package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.persistence.abstraction.model.IContactDetailsEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */

public class ContactDetails implements IContactDetails, IHasEntity<IContactDetailsEntity> {
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
        this.contactDetailsEntity.setPhone2(phone2);
    }

    @Override
    public String getEmail1() {
        return contactDetailsEntity.getEmail1();
    }

    @Override
    public void setEmail1(String email1) {
        this.contactDetailsEntity.setEmail1(email1);
    }

    @Override
    public String getEmail2() {
        return contactDetailsEntity.getEmail2();
    }

    @Override
    public void setEmail2(String email2) {
        this.contactDetailsEntity.setEmail2(email2);
    }

    @Override
    public String getFax() {
        return contactDetailsEntity.getFax();
    }

    @Override
    public void setFax(String fax) {
        this.contactDetailsEntity.setFax(fax);
    }

    @Override
    public String getStreet() {
        return contactDetailsEntity.getStreet();
    }

    @Override
    public void setStreet(String street) {
        this.contactDetailsEntity.setStreet(street);
    }

    @Override
    public String getStreetNumber() {
        return contactDetailsEntity.getStreetNumber();
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        this.contactDetailsEntity.setStreetNumber(streetNumber);
    }

    @Override
    public ILocation getLocation() {
        return new Location(contactDetailsEntity.getLocationEntity());
    }

    @Override
    public void setLocation(ILocation location) throws DomainAttributeException {
        if (location == null)
            throw new DomainAttributeException("Location is empty");
        this.contactDetailsEntity.setLocationEntity(((Location) location).getEntity());
    }

    @Override
    public String getCoordLat() {
        return contactDetailsEntity.getCoordLat();
    }

    @Override
    public void setCoordLat(String coordLat) {
        this.contactDetailsEntity.setCoordLat(coordLat);
    }

    @Override
    public String getCoordLong() {
        return contactDetailsEntity.getCoordLong();
    }

    @Override
    public void setCoordLong(String coordLong) {
        this.contactDetailsEntity.setCoordLong(coordLong);
    }

    @Override
    public String getPhone1() {
        return contactDetailsEntity.getPhone1();
    }

    @Override
    public void setPhone1(String phone1) {
        this.contactDetailsEntity.setPhone1(phone1);
    }

    @Override
    public IContactDetailsEntity getEntity() {
        return contactDetailsEntity;
    }

    @Override
    public boolean isNull() {
        return this.contactDetailsEntity == null;
    }

    @Override
    public Integer getUID() {
        return this.contactDetailsEntity.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ContactDetails that = (ContactDetails) o;

        if(getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return contactDetailsEntity.getId();
    }
}
