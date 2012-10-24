package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class MatchRules {
    IMatchRulesEntity matchRulesEntity;

    public MatchRules(IMatchRulesEntity matchRulesEntity) {
        this.matchRulesEntity = matchRulesEntity;
    }

    public String getName() {
        return matchRulesEntity.name;
    }

    public void setName(String name) {
        this.matchRulesEntity.name = name;
    }

    public MatchType getMatchType() {
        return matchRulesEntity.matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchRulesEntity.matchType = matchType;
    }

    public String getDescription() {
        return matchRulesEntity.description;
    }

    public void setDescription(String description) {
        this.matchRulesEntity.description = description;
    }
}
