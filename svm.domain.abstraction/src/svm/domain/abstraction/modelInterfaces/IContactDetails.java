package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContactDetails extends IModel {
    String getPhone2();

    void setPhone2(String phone2) throws DomainAttributeException;

    String getEmail1();

    void setEmail1(String email1) throws DomainAttributeException;

    String getEmail2();

    void setEmail2(String email2) throws DomainAttributeException;

    String getFax();

    void setFax(String fax) throws DomainAttributeException;

    String getStreet();

    void setStreet(String street) throws DomainAttributeException;

    String getStreetNumber();

    void setStreetNumber(String streetNumber) throws DomainAttributeException;

    ILocation getLocation();

    void setLocation(ILocation location) throws DomainAttributeException;

    String getCoordLat();

    void setCoordLat(String coordLat) throws DomainAttributeException;

    String getCoordLong();

    void setCoordLong(String coordLong) throws DomainAttributeException;

    String getPhone1();

    void setPhone1(String phone1) throws DomainAttributeException;
}
