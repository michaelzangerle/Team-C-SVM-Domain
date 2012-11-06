package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IExternalTeam;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.model.IContestantEntity;
import svm.persistence.abstraction.model.IPartResultEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class Contestant implements IContestant, IHasEntity<IContestantEntity> {
    IContestantEntity contestantEntity;

    public Contestant(IContestantEntity contestantEntity) {
        this.contestantEntity = contestantEntity;
    }

    @Override
    public Team getInternalTeam() {
        return new Team(contestantEntity.getInternalTeam());
    }

    @Override
    public void setInternalTeam(ITeam internalTeam){
        this.contestantEntity.setInternalTeam(((Team) internalTeam).getEntity());
    }

    @Override
    public IExternalTeam getExternalTeam() {
        return new ExternalTeam(contestantEntity.getExternalTeam());
    }

    @Override
    public void setExternalTeam(IExternalTeam externalTeam) {
        this.contestantEntity.setExternalTeam(((ExternalTeam) externalTeam).getEntity());
    }

    @Override
    public Float getResult() {
        Float result = 0F;
        for (IPartResultEntity pr : this.contestantEntity.getPartResults()) {
            result += pr.getResult();
        }
        return result;
    }

    @Override
    public IContestantEntity getEntity() {
        return this.contestantEntity;
    }


}
