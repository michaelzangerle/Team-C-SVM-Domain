package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
public interface IContestant {
    Team getInternalteam();

    void setInternalteam(Team internalTeam);

    ExternalTeam getExternalTeam();

    void setExternalTeam(ExternalTeam externalTeam);
}
