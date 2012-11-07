package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.IContestHasTeam;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;

/**
 * Projectteam : Team C
 * Date: 31.10.12
 */
public class ContestHasTeam implements IContestHasTeam, IHasEntity<IContestsHasTeamsEntity> {

    IContestsHasTeamsEntity contestsHasTeamsEntity;

    public ContestHasTeam(IContestsHasTeamsEntity contestsHasTeamsEntity) {
        this.contestsHasTeamsEntity = contestsHasTeamsEntity;
    }

    @Override
    public ITeam getTeam() {
        return new Team(contestsHasTeamsEntity.getTeam());
    }

    @Override
    public void setTeam(ITeam team) throws DomainAttributeException {
        if (team == null)
            throw new DomainAttributeException("Team is null");
        contestsHasTeamsEntity.setTeam(((Team) team).getEntity());
    }

    @Override
    public IContest getContest() {
        return new Contest(contestsHasTeamsEntity.getContest());
    }

    @Override
    public void setContest(IContest contest) throws DomainAttributeException {
        if (contest == null)
            throw new DomainAttributeException("Team is null");
        contestsHasTeamsEntity.setContest(((Contest) contest).getEntity());
    }

    @Override
    public boolean isConfirmed() {
        return contestsHasTeamsEntity.isConfirmed();
    }

    @Override
    public void setConfirmed(boolean confirmed) {
        contestsHasTeamsEntity.setConfirmed(confirmed);
    }

    @Override
    public String getComment() {
        return contestsHasTeamsEntity.getComment();
    }

    @Override
    public void setComment(String comment) {
        contestsHasTeamsEntity.setComment(comment);
    }

    @Override
    public boolean isPaid() {
        return contestsHasTeamsEntity.isPaid();
    }

    @Override
    public void setPaid(boolean paid) {
        contestsHasTeamsEntity.setPaid(paid);
    }

    @Override
    public IContestsHasTeamsEntity getEntity() {
        return contestsHasTeamsEntity;
    }
}
