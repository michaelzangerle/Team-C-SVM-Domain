package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public interface IContactDetails {
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

    int getLocation();

    void setLocation(int location);

    Long getCoordLat();

    void setCoordLat(Long coordLat);

    Long getCoordLong();

    void setCoordLong(Long coordLong);

    String getPhone1();

    void setPhone1(String phone1);
}
