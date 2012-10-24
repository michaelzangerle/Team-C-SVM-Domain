package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
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
