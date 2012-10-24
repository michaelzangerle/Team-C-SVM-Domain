package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
public interface IContest {
    String getName();

    void setName(String name);

    Date getStart();

    void setStart(Date start);

    ContactDetails getContactDetails();

    void setContactDetails(ContactDetails contactDetails);

    Date getEnd();

    void setEnd(Date end);

    Float getFee();

    void setFee(Float fee);
}
