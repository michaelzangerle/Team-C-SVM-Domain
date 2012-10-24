package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class ExternalTeam {
    String name;
    String alias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    ContactDetails contactDetails;
}
