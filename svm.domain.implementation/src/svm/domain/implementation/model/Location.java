package svm.domain.implementation.model;

import sun.beans.editors.StringEditor;
import svm.domain.abstraction.modelInterfaces.ILocation;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Location implements ILocation {
    ILocationEntity locationEntity;

    public Location(ILocationEntity LocationEntity) {
        this.locationEntity = LocationEntity;
    }

    @Override
    public String getCountryCode() {
        return locationEntity.countryCode;
    }

    @Override
    public void setCountryCode(String countryCode) {
        this.locationEntity.countryCode = countryCode;
    }

    @Override
    public String getPostalCode() {
        return locationEntity.postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.locationEntity.postalCode = postalCode;
    }

    @Override
    public String getPlaceName() {
        return locationEntity.placeName;
    }

    @Override
    public void setPlaceName(String placeName) {
        this.locationEntity.placeName = placeName;
    }

    @Override
    public String getDistrict() {
        return locationEntity.district;
    }

    @Override
    public void setDistrict(String district) {
        this.locationEntity.district = district;
    }

    @Override
    public String getDistrictID() {
        return locationEntity.districtID;
    }

    @Override
    public void setDistrictID(String districtID) {
        this.locationEntity.districtID = districtID;
    }

    @Override
    public String getProvince() {
        return locationEntity.province;
    }

    @Override
    public void setProvince(String province) {
        this.locationEntity.province = province;
    }

    @Override
    public String getProvinceID() {
        return locationEntity.provinceID;
    }

    @Override
    public void setProvinceID(String provinceID) {
        this.locationEntity.provinceID = provinceID;
    }

    @Override
    public String getCommunity() {
        return locationEntity.community;
    }

    @Override
    public void setCommunity(String community) {
        this.locationEntity.community = community;
    }

    @Override
    public String getCommunityID() {
        return locationEntity.communityID;
    }

    @Override
    public void setCommunityID(String communityID) {
        this.locationEntity.communityID = communityID;
    }

    @Override
    public String getLatitude() {
        return locationEntity.latitude;
    }

    @Override
    public void setLatitude(String latitude) {
        this.locationEntity.latitude = latitude;
    }

    @Override
    public String getLongitude() {
        return locationEntity.longitude;
    }

    @Override
    public void setLongitude(String longitude) {
        this.locationEntity.longitude = longitude;
    }

    @Override
    public String getAccuracy() {
        return locationEntity.accuracy;
    }

    @Override
    public void setAccuracy(String accuracy) {
        this.locationEntity.accuracy = accuracy;
    }
}
