package svm.domain.abstraction.modelInterfaces;

import svm.persistence.abstraction.model.IEntity;

import java.rmi.Remote;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IHasEntity<T extends IEntity>  extends Remote{
    T getEntity();
}
