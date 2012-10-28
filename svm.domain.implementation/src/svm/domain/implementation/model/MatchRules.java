package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMatchRules;
import svm.domain.abstraction.modelInterfaces.IMatchType;
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
    public IMatchType getMatchType() {
        return new MatchType(matchRulesEntity.getMatchType());

    }

    @Override
    public void setMatchType(IMatchType matchType) {
        this.matchRulesEntity.setMatchType(((MatchType) matchType).getEntity());
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
}
