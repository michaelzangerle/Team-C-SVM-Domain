package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contestant {
    Team internalTeam;
    ExternalTeam externalTeam;

    public Team getInternalteam() {
        return internalTeam;
    }

    public void setInternalteam(Team internalTeam) {
        this.internalTeam = internalTeam;
    }

    public ExternalTeam getExternalTeam() {
        return externalTeam;
    }

    public void setExternalTeam(ExternalTeam externalTeam) {
        this.externalTeam = externalTeam;
    }
}
