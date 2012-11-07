package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.ITeamType;
import svm.persistence.abstraction.model.ITeamTypeEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class TeamType implements ITeamType, IHasEntity<ITeamTypeEntity> {
    ITeamTypeEntity teamTypeEntity;

    public TeamType(ITeamTypeEntity teamTypeEntity) {
        this.teamTypeEntity = teamTypeEntity;
    }

    @Override
    public String getName() {
        return teamTypeEntity.getName();
    }

    @Override
    public void setName(String name) throws DomainAttributeException {
        if (name == null || name.isEmpty())
            throw new DomainAttributeException("name is empty");
        this.teamTypeEntity.setName(name);
    }

    @Override
    public String getDescription() {
        return teamTypeEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.teamTypeEntity.setDescription(description);
    }

    @Override
    public ITeamTypeEntity getEntity() {
        return teamTypeEntity;
    }

    @Override
    public boolean isNull() {
        return teamTypeEntity == null;
    }
}
