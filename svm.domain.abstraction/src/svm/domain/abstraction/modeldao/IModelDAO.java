package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.modelInterfaces.IModel;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IModelDAO<T extends IModel> {
    T getByUID(int sessionId, int id) throws NoSessionFoundException;

    List<T> getAll(int sessionId) throws NoSessionFoundException;

    void saveOrUpdate(int sessionId, T obj) throws NoSessionFoundException;

    T generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException;

    T generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException;
}
