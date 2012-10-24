package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public interface IMatch {
    String getName();

    void setName(String name);

    Date getStart();

    void setStart(Date start);

    Date getEnd();

    void setEnd(Date end);

    Boolean getCancelled();

    void setCancelled(Boolean cancelled);

    String getRemarks();

    void setRemarks(String remarks);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails IContactDetails);
}
