package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IContest extends IModel {
    String getName();

    void setName(String name) throws DomainAttributeException;

    Date getStart();

    void setStart(Date start);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails);

    Date getEnd();

    void setEnd(Date end);

    Float getFee();

    void setFee(Float fee);
}
