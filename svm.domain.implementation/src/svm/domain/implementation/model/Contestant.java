package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IExternalTeam;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.model.IContestantEntity;

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
    public void setInternalTeam(ITeam internalTeam) throws DomainAttributeException {
        if(internalTeam==null)
            throw new DomainAttributeException("internal Team is null");
        this.contestantEntity.setInternalTeam(((Team) internalTeam).getEntity());
    }

    @Override
    public IExternalTeam getExternalTeam() {
        return new ExternalTeam(contestantEntity.getExternalTeam());
    }

    @Override
    public void setExternalTeam(IExternalTeam externalTeam) throws DomainAttributeException {
        if(externalTeam==null)
            throw new DomainAttributeException("extarnal Team is null");
        this.contestantEntity.setExternalTeam(((ExternalTeam) externalTeam).getEntity());
    }

    @Override
    public IContestantEntity getEntity() {
        return this.contestantEntity;
    }


}
