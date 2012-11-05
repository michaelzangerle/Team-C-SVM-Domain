package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.Date;
import java.util.List;

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

    public void addInternalTeam(ITeam team) throws DomainException;

    public void addExternalTeam(IExternalTeam team) throws DomainException, NoSessionFoundException, InstantiationException, IllegalAccessException;

    public void removeInternalTeam(ITeam team) throws DomainException;

    public void removeExternalTeam(IExternalTeam team) throws DomainException;

    public void addMatch(IMatch match) throws DomainException;

    public void removeMatch(IMatch match) throws DomainException;

    List<IMatch> getMatches();

    List<ITeam> getTeams();

    List<IExternalTeam> getExternalTeams();
}
