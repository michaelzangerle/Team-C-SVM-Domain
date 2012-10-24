package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class MatchRules {
    String name;
    MatchType matchType;
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
