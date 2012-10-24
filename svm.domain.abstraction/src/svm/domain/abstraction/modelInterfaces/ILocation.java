package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ILocation {
    String getCountryCode();

    void setCountryCode(String countryCode);

    String getPostalCode();

    void setPostalCode(String postalCode);

    String getPlaceName();

    void setPlaceName(String placeName);

    String getDistrict();

    void setDistrict(String district);

    String getDistrictID();

    void setDistrictID(String districtID);

    String getProvince();

    void setProvince(String province);

    String getProvinceID();

    void setProvinceID(String provinceID);

    String getCommunity();

    void setCommunity(String community);

    String getCommunityID();

    void setCommunityID(String communityID);

    String getLatitude();

    void setLatitude(String latitude);

    String getLongitude();

    void setLongitude(String longitude);

    String getAccuracy();

    void setAccuracy(String accuracy);
}
