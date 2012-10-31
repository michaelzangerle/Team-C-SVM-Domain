package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IContest extends IModel {
    String getName();

    void setName(String name) throws DomainAttributeException;

    Date getStart();

    void setStart(Date start) throws DomainParameterCheckException;

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails contactDetails) throws DomainAttributeException;

    Date getEnd();

    void setEnd(Date end) throws DomainParameterCheckException;

    Float getFee();

    void setFee(Float fee) throws DomainParameterCheckException, DomainAttributeException;

    public void addInternalTeam(ITeam team) throws DomainAttributeException, DomainParameterCheckException;

    public void addExternalTeam(IExternalTeam team) throws DomainAttributeException, DomainParameterCheckException;
}
