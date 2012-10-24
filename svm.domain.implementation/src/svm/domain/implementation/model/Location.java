package svm.domain.implementation.model;

import sun.beans.editors.StringEditor;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Location {
    ILocationEntity locationEntity;

    public Location(ILocationEntity LocationEntity) {
        this.locationEntity = LocationEntity;
    }

    public String getCountryCode() {
        return locationEntity.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.locationEntity.countryCode = countryCode;
    }

    public String getPostalCode() {
        return locationEntity.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.locationEntity.postalCode = postalCode;
    }

    public String getPlaceName() {
        return locationEntity.placeName;
    }

    public void setPlaceName(String placeName) {
        this.locationEntity.placeName = placeName;
    }

    public String getDistrict() {
        return locationEntity.district;
    }

    public void setDistrict(String district) {
        this.locationEntity.district = district;
    }

    public String getDistrictID() {
        return locationEntity.districtID;
    }

    public void setDistrictID(String districtID) {
        this.locationEntity.districtID = districtID;
    }

    public String getProvince() {
        return locationEntity.province;
    }

    public void setProvince(String province) {
        this.locationEntity.province = province;
    }

    public String getProvinceID() {
        return locationEntity.provinceID;
    }

    public void setProvinceID(String provinceID) {
        this.locationEntity.provinceID = provinceID;
    }

    public String getCommunity() {
        return locationEntity.community;
    }

    public void setCommunity(String community) {
        this.locationEntity.community = community;
    }

    public String getCommunityID() {
        return locationEntity.communityID;
    }

    public void setCommunityID(String communityID) {
        this.locationEntity.communityID = communityID;
    }

    public String getLatitude() {
        return locationEntity.latitude;
    }

    public void setLatitude(String latitude) {
        this.locationEntity.latitude = latitude;
    }

    public String getLongitude() {
        return locationEntity.longitude;
    }

    public void setLongitude(String longitude) {
        this.locationEntity.longitude = longitude;
    }

    public String getAccuracy() {
        return locationEntity.accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.locationEntity.accuracy = accuracy;
    }
}
