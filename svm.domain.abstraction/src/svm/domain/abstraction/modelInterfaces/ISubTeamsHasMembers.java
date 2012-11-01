package svm.domain.abstraction.modelInterfaces;

/**
 * ProjectTeam: Team C
 * Date: 01.11.12
 */
public interface ISubTeamsHasMembers extends IModel {
    ISubTeam getSubTeam();

    void setSubTeam(ISubTeam subTeam);

    IMember getMember();

    void setMember(IMember member);

    Boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    String getComment();

    void setComment(String comment);
}
