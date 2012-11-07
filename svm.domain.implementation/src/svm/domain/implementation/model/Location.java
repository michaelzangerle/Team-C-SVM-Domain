package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.persistence.abstraction.model.ILocationEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Location implements ILocation, IHasEntity<ILocationEntity> {
    ILocationEntity locationEntity;

    public Location(ILocationEntity LocationEntity) {
        this.locationEntity = LocationEntity;
    }

    @Override
    public String getCountryCode() {
        return locationEntity.getCountryCode();
    }

    @Override
    public void setCountryCode(String countryCode) throws DomainAttributeException {
        if (countryCode == null || countryCode.isEmpty())
            throw new DomainAttributeException("Country Code is empty");
        this.locationEntity.setCountryCode(countryCode);
    }

    @Override
    public String getPostalCode() {
        return locationEntity.getPostalCode();
    }

    @Override
    public void setPostalCode(String postalCode) throws DomainAttributeException {
        if (postalCode == null || postalCode.isEmpty())
            throw new DomainAttributeException("postal code is empty");
        this.locationEntity.setPostalCode(postalCode);
    }

    @Override
    public String getPlaceName() {
        return locationEntity.getPlaceName();
    }

    @Override
    public void setPlaceName(String placeName) throws DomainAttributeException {
        if (placeName == null || placeName.isEmpty())
            throw new DomainAttributeException("place name is empty");
        this.locationEntity.setPlaceName(placeName);
    }

    @Override
    public String getDistrict() {
        return locationEntity.getDistrict();
    }

    @Override
    public void setDistrict(String district) throws DomainAttributeException {
        if (district == null || district.isEmpty())
            throw new DomainAttributeException("district is empty");
        this.locationEntity.setDistrict(district);
    }

    @Override
    public String getDistrictID() {
        return locationEntity.getDistrictId();
    }

    @Override
    public void setDistrictID(String districtID) throws DomainAttributeException {
        if (districtID == null || districtID.isEmpty())
            throw new DomainAttributeException("district ID is empty");
        this.locationEntity.setDistrictId(districtID);
    }

    @Override
    public String getProvince() {
        return locationEntity.getProvince();
    }

    @Override
    public void setProvince(String province) throws DomainAttributeException {
        if (province == null || province.isEmpty())
            throw new DomainAttributeException("province is empty");
        this.locationEntity.setProvince(province);
    }

    @Override
    public String getProvinceID() {
        return locationEntity.getProvinceId();
    }

    @Override
    public void setProvinceID(String provinceID) throws DomainAttributeException {
        if (provinceID == null || provinceID.isEmpty())
            throw new DomainAttributeException("province ID is empty");
        this.locationEntity.setProvinceId(provinceID);
    }

    @Override
    public String getCommunity() {
        return locationEntity.getCommunity();
    }

    @Override
    public void setCommunity(String community) throws DomainAttributeException {
        if (community == null || community.isEmpty())
            throw new DomainAttributeException("community is empty");
        this.locationEntity.setCommunity(community);
    }

    @Override
    public String getCommunityID() {
        return locationEntity.getCommunityId();
    }

    @Override
    public void setCommunityID(String communityID) throws DomainAttributeException {
        if (communityID == null || communityID.isEmpty())
            throw new DomainAttributeException("community ID is empty");
        this.locationEntity.setCommunityId(communityID);
    }

    @Override
    public String getLatitude() {
        return locationEntity.getLatitude();
    }

    @Override
    public void setLatitude(String latitude) throws DomainAttributeException {
        if (latitude == null || latitude.isEmpty())
            throw new DomainAttributeException("latitude is empty");
        this.locationEntity.setLatitude(latitude);
    }

    @Override
    public String getLongitude() {
        return locationEntity.getLongitude();
    }

    @Override
    public void setLongitude(String longitude) throws DomainAttributeException {
        if (longitude == null || longitude.isEmpty())
            throw new DomainAttributeException("longitude is empty");
        this.locationEntity.setLongitude(longitude);
    }

    @Override
    public String getAccuracy() {
        return locationEntity.getAccuracy();
    }

    @Override
    public void setAccuracy(String accuracy) throws DomainAttributeException {
        if (accuracy == null || accuracy.isEmpty())
            throw new DomainAttributeException("accuracy is empty");
        this.locationEntity.setAccuracy(accuracy);
    }


    @Override
    public ILocationEntity getEntity() {
        return locationEntity;
    }

    @Override
    public boolean isNull() {
        return locationEntity == null;
    }
}
