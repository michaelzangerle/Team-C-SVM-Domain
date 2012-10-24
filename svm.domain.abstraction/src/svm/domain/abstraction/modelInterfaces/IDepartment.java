package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
public interface IDepartment {
    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails IContactDetails);
}
