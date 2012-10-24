package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IExternalTeam;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class ExternalTeam implements IExternalTeam {
    IExternalTeamEntity externalTeamEntity;

    public ExternalTeam(IExternalTeamEntity externalTeamEntity) {
        this.externalTeamEntity = externalTeamEntity;
    }

    @Override
    public String getName() {
        return externalTeamEntity.name;
    }

    @Override
    public void setName(String name) {
        this.externalTeamEntity.name = name;
    }

    @Override
    public String getAlias() {
        return externalTeamEntity.alias;
    }

    @Override
    public void setAlias(String alias) {
        this.externalTeamEntity.alias = alias;
    }

    @Override
    public IContactDetails getContactDetails() {
        return externalTeamEntity.contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetails IContactDetails) {
        this.externalTeamEntity.contactDetails = IContactDetails;
    }
}
