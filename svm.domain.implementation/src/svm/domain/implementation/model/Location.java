package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.persistence.abstraction.model.ILocationEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Location implements ILocation,IHasEntity<ILocationEntity> {
    ILocationEntity locationEntity;

    public Location(ILocationEntity LocationEntity) {
        this.locationEntity = LocationEntity;
    }

    @Override
    public String getCountryCode() {
        return locationEntity.getCountryCode();
    }

    @Override
    public void setCountryCode(String countryCode) {
        this.locationEntity.setCountryCode(countryCode);
    }

    @Override
    public String getPostalCode() {
        return locationEntity.getPostalCode();
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.locationEntity.setPostalCode(postalCode);
    }

    @Override
    public String getPlaceName() {
        return locationEntity.getPlaceName();
    }

    @Override
    public void setPlaceName(String placeName) {
        this.locationEntity.setPlaceName(placeName);
    }

    @Override
    public String getDistrict() {
        return locationEntity.getDistrict();
    }

    @Override
    public void setDistrict(String district) {
        this.locationEntity.setDistrict(district);
    }

    @Override
    public String getDistrictID() {
        return locationEntity.getDistrictId();
    }

    @Override
    public void setDistrictID(String districtID) {
        this.locationEntity.setDistrictId(districtID);
    }

    @Override
    public String getProvince() {
        return locationEntity.getProvince();
    }

    @Override
    public void setProvince(String province) {
        this.locationEntity.setProvince(province);
    }

    @Override
    public String getProvinceID() {
        return locationEntity.getProvinceId();
    }

    @Override
    public void setProvinceID(String provinceID) {
        this.locationEntity.setProvinceId(provinceID);
    }

    @Override
    public String getCommunity() {
        return locationEntity.getCommunity();
    }

    @Override
    public void setCommunity(String community) {
        this.locationEntity.setCommunity(community);
    }

    @Override
    public String getCommunityID() {
        return locationEntity.getCommunityId();
    }

    @Override
    public void setCommunityID(String communityID) {
        this.locationEntity.setCommunityId(communityID);
    }

    @Override
    public String getLatitude() {
        return locationEntity.getLatitude();
    }

    @Override
    public void setLatitude(String latitude) {
        this.locationEntity.setLatitude(latitude);
    }

    @Override
    public String getLongitude() {
        return locationEntity.getLongitude();
    }

    @Override
    public void setLongitude(String longitude) {
        this.locationEntity.setLongitude(longitude);
    }

    @Override
    public String getAccuracy() {
        return locationEntity.getAccuracy();
    }

    @Override
    public void setAccuracy(String accuracy) {
        this.locationEntity.setAccuracy(accuracy);
    }


    @Override
    public ILocationEntity getEntity() {
        return locationEntity;
    }
}
