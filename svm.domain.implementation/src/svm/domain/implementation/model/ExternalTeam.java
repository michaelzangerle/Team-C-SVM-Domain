package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class ExternalTeam {
    IExternalTeamEntity externalTeamEntity;

    public ExternalTeam(IExternalTeamEntity externalTeamEntity) {
        this.externalTeamEntity = externalTeamEntity;
    }

    public String getName() {
        return externalTeamEntity.name;
    }

    public void setName(String name) {
        this.externalTeamEntity.name = name;
    }

    public String getAlias() {
        return externalTeamEntity.alias;
    }

    public void setAlias(String alias) {
        this.externalTeamEntity.alias = alias;
    }

    public ContactDetails getContactDetails() {
        return externalTeamEntity.contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.externalTeamEntity.contactDetails = contactDetails;
    }
}
