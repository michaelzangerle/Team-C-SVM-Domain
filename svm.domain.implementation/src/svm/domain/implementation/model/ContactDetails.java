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
    public void setPhone2(String phone2)  {
        this.contactDetailsEntity.setPhone2(phone2);
    }

    @Override
    public String getEmail1() {
        return contactDetailsEntity.getEmail1();
    }

    @Override
    public void setEmail1(String email1) throws DomainAttributeException {
        if(email1.equals(new String()))
            throw new DomainAttributeException("Email 1 is empty");
        this.contactDetailsEntity.setEmail1(email1);
    }

    @Override
    public String getEmail2() {
        return contactDetailsEntity.getEmail2();
    }

    @Override
    public void setEmail2(String email2) throws DomainAttributeException {
        if(email2.equals(new String()))
            throw new DomainAttributeException("Email 2 is empty");
        this.contactDetailsEntity.setEmail2(email2);
    }

    @Override
    public String getFax() {
        return contactDetailsEntity.getFax();
    }

    @Override
    public void setFax(String fax) throws DomainAttributeException {
        if(fax.equals(new String()))
            throw new DomainAttributeException("Fax is empty");
        this.contactDetailsEntity.setFax(fax);
    }

    @Override
    public String getStreet() {
        return contactDetailsEntity.getStreet();
    }

    @Override
    public void setStreet(String street) throws DomainAttributeException {
        if(street.equals(new String()))
            throw new DomainAttributeException("street is empty");
        this.contactDetailsEntity.setStreet(street);
    }

    @Override
    public String getStreetNumber() {
        return contactDetailsEntity.getStreetNumber();
    }

    @Override
    public void setStreetNumber(String streetNumber) throws DomainAttributeException {
        if(streetNumber.equals(new String()))
            throw new DomainAttributeException("street number is empty");
        this.contactDetailsEntity.setStreetNumber(streetNumber);
    }

    @Override
    public ILocation getLocation() {
        return new Location(contactDetailsEntity.getLocationEntity());
    }

    @Override
    public void setLocation(ILocation location) throws DomainAttributeException {
        if(location==null)
            throw new DomainAttributeException("Location is empty");
        this.contactDetailsEntity.setLocationEntity(((Location) location).getEntity());
    }

    @Override
    public String getCoordLat() {
        return contactDetailsEntity.getCoordLat();
    }

    @Override
    public void setCoordLat(String coordLat) throws DomainAttributeException {
        if(coordLat.equals(new String()))
            throw new DomainAttributeException("Coord Lat is empty");
        this.contactDetailsEntity.setCoordLat(coordLat);
    }

    @Override
    public String getCoordLong() {
        return contactDetailsEntity.getCoordLong();
    }

    @Override
    public void setCoordLong(String coordLong) throws DomainAttributeException {
        if(coordLong.equals(new String()))
            throw new DomainAttributeException("Coord Long is empty");
        this.contactDetailsEntity.setCoordLong(coordLong);
    }

    @Override
    public String getPhone1() {
        return contactDetailsEntity.getPhone1();
    }

    @Override
    public void setPhone1(String phone1) throws DomainAttributeException {
        if(phone1.equals(new String()))
            throw new DomainAttributeException("phone 1 is empty");
        this.contactDetailsEntity.setPhone1(phone1);
    }

    @Override
    public IContactDetailsEntity getEntity() {
        return contactDetailsEntity;
    }
}
