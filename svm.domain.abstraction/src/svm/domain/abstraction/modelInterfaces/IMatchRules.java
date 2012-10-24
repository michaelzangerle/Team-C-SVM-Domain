package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMatchRules {
    String getName();

    void setName(String name);

    IMatchType getMatchType();

    void setMatchType(IMatchType matchType);

    String getDescription();

    void setDescription(String description);
}
