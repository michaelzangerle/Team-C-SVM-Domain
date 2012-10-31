package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public interface IContestHasTeam extends IModel {

    ITeam getTeam();

    void setTeam(ITeam team) throws DomainAttributeException;

    IContest getContest();

    void setContest(IContest contest) throws DomainAttributeException;

    boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    String getComment();

    void setComment(String comment);

    boolean isPaid();

    void setPaid(boolean paid);
}
