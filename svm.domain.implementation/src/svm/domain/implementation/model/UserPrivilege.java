package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class UserPrivilege {
    enum alias{};
    String name;
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
