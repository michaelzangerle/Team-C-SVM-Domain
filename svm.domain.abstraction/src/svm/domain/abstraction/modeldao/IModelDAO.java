package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IModel;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IModelDAO<T extends IModel> {
    List<T> getAll(int sessionId) throws NoSessionFoundException;

    <U extends IModel & IHasEntity> void saveOrUpdate(int sessionId, U obj) throws NoSessionFoundException;

    T generateObject(int sessionId) throws InstantiationException, IllegalAccessException;
}
