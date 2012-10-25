package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IMatchRules;
import svm.domain.abstraction.modelInterfaces.IMatchType;
import svm.persistence.abstraction.model.IMatchRulesEntity;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class MatchRules implements IMatchRules {
    IMatchRulesEntity matchRulesEntity;

    public MatchRules(IMatchRulesEntity matchRulesEntity) {
        this.matchRulesEntity = matchRulesEntity;
    }

    @Override
    public String getName() {
        return matchRulesEntity.name;
    }

    @Override
    public void setName(String name) {
        this.matchRulesEntity.name = name;
    }

    @Override
    public IMatchType getMatchType() {
        return matchRulesEntity.matchType;
    }

    @Override
    public void setMatchType(IMatchType IMatchType) {
        this.matchRulesEntity.matchType = IMatchType;
    }

    @Override
    public String getDescription() {
        return matchRulesEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.matchRulesEntity.description = description;
    }
}
