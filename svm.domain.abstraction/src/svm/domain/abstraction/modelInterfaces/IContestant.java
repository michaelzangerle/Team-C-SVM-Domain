package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestant {
    ITeam getInternalteam();

    void setInternalteam(ITeam internalTeam);

    IExternalTeam getExternalTeam();

    void setExternalTeam(IExternalTeam externalTeam);
}
