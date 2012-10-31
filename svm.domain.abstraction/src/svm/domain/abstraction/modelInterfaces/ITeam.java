package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.exception.DomainParameterCheckException;

import java.util.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ITeam extends IModel {
    String getName();

    void setName(String name) throws DomainAttributeException;

    String getAlias();

    void setAlias(String alias) throws DomainAttributeException;

    Date getFounded();

    void setFounded(Date founded) throws DomainParameterCheckException;

    ISport getSport();

    void setSport(ISport ISport) throws DomainAttributeException;

    ITeamType getTeamType();

    void setTeamType(ITeamType ITeamType) throws DomainAttributeException;

    IMember getContactPerson();

    void setContactPerson(IMember contactPerson) throws DomainAttributeException;

    public List<IContestHasTeam> getContest();
}
