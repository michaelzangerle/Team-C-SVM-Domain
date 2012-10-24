package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contestant {
    IContestantEntity contestantEntity;

    public Contestant(IContestantEntity contestantEntity) {
        this.contestantEntity = contestantEntity;
    }

    public Team getInternalteam() {
        return contestantEntity.internalTeam;
    }

    public void setInternalteam(Team internalTeam) {
        this.contestantEntity.internalTeam = internalTeam;
    }

    public ExternalTeam getExternalTeam() {
        return contestantEntity.externalTeam;
    }

    public void setExternalTeam(ExternalTeam externalTeam) {
        this.contestantEntity.externalTeam = externalTeam;
    }
}
