package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestant {
    ITeam getInternalTeam();

    void setInternalTeam(ITeam internalTeam);

    IExternalTeam getExternalTeam();

    void setExternalTeam(IExternalTeam externalTeam);
}
