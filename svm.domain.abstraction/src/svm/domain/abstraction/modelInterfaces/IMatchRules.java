package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public interface IMatchRules {
    String getName();

    void setName(String name);

    MatchType getMatchType();

    void setMatchType(MatchType matchType);

    String getDescription();

    void setDescription(String description);
}
