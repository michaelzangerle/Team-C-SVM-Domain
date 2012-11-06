package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestant extends IModel{
    ITeam getInternalTeam();

    void setInternalTeam(ITeam internalTeam);

    IExternalTeam getExternalTeam();

    void setExternalTeam(IExternalTeam externalTeam);

    Float getResult();
}
