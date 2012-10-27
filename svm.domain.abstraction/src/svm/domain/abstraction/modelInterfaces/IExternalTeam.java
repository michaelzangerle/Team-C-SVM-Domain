package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IExternalTeam extends IModel{
    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails IContactDetails);
}
