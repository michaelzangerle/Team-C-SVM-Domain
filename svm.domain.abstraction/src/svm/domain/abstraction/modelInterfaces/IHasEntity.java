package svm.domain.abstraction.modelInterfaces;

import svm.persistence.abstraction.model.IEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IHasEntity<T extends IEntity> {
    T getEntity();
}
