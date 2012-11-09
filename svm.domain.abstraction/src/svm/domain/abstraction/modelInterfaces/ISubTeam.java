package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

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

    void addMember(IMember member) throws DomainException, NoSessionFoundException, IllegalAccessException, InstantiationException, NotSupportedException, svm.persistence.abstraction.exceptions.NotSupportedException;

    void removeMember(IMember member);

    IContest getContest();

    Boolean isMember(IMember member);
}
