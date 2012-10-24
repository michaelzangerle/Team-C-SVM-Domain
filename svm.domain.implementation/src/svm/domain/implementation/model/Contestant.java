package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IExternalTeam;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contestant implements IContestant {
    IContestantEntity contestantEntity;

    public Contestant(IContestantEntity contestantEntity) {
        this.contestantEntity = contestantEntity;
    }

    @Override
    public Team getInternalteam() {
        return contestantEntity.internalTeam;
    }

    @Override
    public void setInternalteam(Team internalTeam) {
        this.contestantEntity.internalTeam = internalTeam;
    }

    @Override
    public IExternalTeam getExternalTeam() {
        return contestantEntity.externalTeam;
    }

    @Override
    public void setExternalTeam(IExternalTeam IExternalTeam) {
        this.contestantEntity.externalTeam = IExternalTeam;
    }
}
