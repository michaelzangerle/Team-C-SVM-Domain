package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMatchRules;
import svm.persistence.abstraction.model.IMatchRulesEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MatchRules implements IMatchRules, IHasEntity<IMatchRulesEntity> {
    IMatchRulesEntity matchRulesEntity;

    public MatchRules(IMatchRulesEntity matchRulesEntity) {
        this.matchRulesEntity = matchRulesEntity;
    }

    @Override
    public String getName() {
        return matchRulesEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.matchRulesEntity.setName(name);
    }

    @Override
    public String getDescription() {
        return matchRulesEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.matchRulesEntity.setDescription(description);
    }

    @Override
    public IMatchRulesEntity getEntity() {
        return matchRulesEntity;
    }

    @Override
    public boolean isNull() {
        return matchRulesEntity == null;
    }
}
