package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainAttributeException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ISport extends IModel{
    String getName();

    void setName(String name) throws DomainAttributeException;

    String getAlias();

    void setAlias(String alias) throws DomainAttributeException;

    String getDescription();

    void setDescription(String description);

    IDepartment getDepartment();

    void setDepartment(IDepartment department) throws DomainAttributeException;
}
