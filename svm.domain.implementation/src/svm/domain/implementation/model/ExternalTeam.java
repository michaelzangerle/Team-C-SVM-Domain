package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.IExternalTeam;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.persistence.abstraction.model.IExternalTeamEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class ExternalTeam implements IExternalTeam, IHasEntity<IExternalTeamEntity> {
    IExternalTeamEntity externalTeamEntity;

    public ExternalTeam(IExternalTeamEntity externalTeamEntity) {
        this.externalTeamEntity = externalTeamEntity;
    }

    @Override
    public String getName() {
        return externalTeamEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.externalTeamEntity.setName(name);
    }

    @Override
    public String getAlias() {
        return externalTeamEntity.getAlias();
    }

    @Override
    public void setAlias(String alias) {
        this.externalTeamEntity.setAlias(alias);
    }

    @Override
    public IContactDetails getContactDetails() {
        return new ContactDetails(externalTeamEntity.getContactDetails());

    }

    @Override
    public void setContactDetails(IContactDetails contactDetails) {
        this.externalTeamEntity.setContactDetails(((ContactDetails) contactDetails).getEntity());
    }

    @Override
    public IExternalTeamEntity getEntity() {
        return externalTeamEntity;
    }

    @Override
    public boolean isNull() {
        return externalTeamEntity == null;
    }

    @Override
    public Integer getUID() {
        return this.externalTeamEntity.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalTeam that = (ExternalTeam) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
