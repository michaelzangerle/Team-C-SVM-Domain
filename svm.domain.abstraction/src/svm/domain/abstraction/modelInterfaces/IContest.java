package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContest {
    String getName();

    void setName(String name);

    Date getStart();

    void setStart(Date start);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails);

    Date getEnd();

    void setEnd(Date end);

    Float getFee();

    void setFee(Float fee);
}
