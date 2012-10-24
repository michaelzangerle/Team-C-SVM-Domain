package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.ITeam;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contestant {
    IContestantEntity contestantEntity;

    public Contestant(IContestantEntity contestantEntity) {
        this.contestantEntity = contestantEntity;
    }

    public ITeam getInternalteam() {
        return contestantEntity.internalTeam;
    }

    public void setInternalteam(ITeam internalITeam) {
        this.contestantEntity.internalTeam = internalITeam;
    }

    public ExternalTeam getExternalTeam() {
        return contestantEntity.externalTeam;
    }

    public void setExternalTeam(ExternalTeam externalTeam) {
        this.contestantEntity.externalTeam = externalTeam;
    }
}
