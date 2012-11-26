package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ILocation extends IModel {
    String getCountryCode();

    void setCountryCode(String countryCode) throws DomainAttributeException;

    String getPostalCode();

    void setPostalCode(String postalCode) throws DomainAttributeException;

    String getPlaceName();

    void setPlaceName(String placeName) throws DomainAttributeException;

    String getDistrict();

    void setDistrict(String district) throws DomainAttributeException;

    String getDistrictID();

    void setDistrictID(String districtID) throws DomainAttributeException;

    String getProvince();

    void setProvince(String province) throws DomainAttributeException;

    String getProvinceID();

    void setProvinceID(String provinceID) throws DomainAttributeException;

    String getCommunity();

    void setCommunity(String community) throws DomainAttributeException;

    String getCommunityID();

    void setCommunityID(String communityID) throws DomainAttributeException;

    String getLatitude();

    void setLatitude(String latitude) throws DomainAttributeException;

    String getLongitude();

    void setLongitude(String longitude) throws DomainAttributeException;

    String getAccuracy();

    void setAccuracy(String accuracy) throws DomainAttributeException;
}
