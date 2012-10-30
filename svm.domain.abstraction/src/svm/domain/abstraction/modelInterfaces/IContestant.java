package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestant extends IModel{
    ITeam getInternalTeam();

    void setInternalTeam(ITeam internalTeam) throws DomainAttributeException;

    IExternalTeam getExternalTeam();

    void setExternalTeam(IExternalTeam externalTeam) throws DomainAttributeException;
}
