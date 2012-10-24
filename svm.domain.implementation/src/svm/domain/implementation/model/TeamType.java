package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */
public class TeamType {
    String name;
    enum alias{};
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
