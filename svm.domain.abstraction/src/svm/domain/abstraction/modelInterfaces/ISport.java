package svm.domain.abstraction.modelInterfaces;

import  svm.domain.abstraction.modelInterfaces.IDepartment;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ISport {
    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    IDepartment getDepartment();

    void setDepartment(IDepartment department);
}
