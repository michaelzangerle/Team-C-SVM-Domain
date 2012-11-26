package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContactDetails extends IModel {
    String getPhone2();

    void setPhone2(String phone2);

    String getEmail1();

    void setEmail1(String email1);

    String getEmail2();

    void setEmail2(String email2);

    String getFax();

    void setFax(String fax);

    String getStreet();

    void setStreet(String street);

    String getStreetNumber();

    void setStreetNumber(String streetNumber);

    ILocation getLocation();

    void setLocation(ILocation location) throws DomainAttributeException;

    String getCoordLat();

    void setCoordLat(String coordLat);

    String getCoordLong();

    void setCoordLong(String coordLong);

    String getPhone1();

    void setPhone1(String phone1);
}
