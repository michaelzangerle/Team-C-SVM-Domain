package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public interface IExternalTeam {
    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails IContactDetails);
}
