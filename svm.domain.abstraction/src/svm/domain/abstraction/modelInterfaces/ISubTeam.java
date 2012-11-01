package svm.domain.abstraction.modelInterfaces;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 01.11.12
 */
public interface ISubTeam extends IModel {
    String getName();

    void setName(String name);

    void setContest(IContest contest);

    ITeam getTeam();

    void setTeam(ITeam contest);

    List<ISubTeamsHasMembers> getSubTeamMembers();
}
