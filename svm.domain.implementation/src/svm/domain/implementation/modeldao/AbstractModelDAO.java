package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IModel;
import svm.domain.abstraction.modeldao.IModelDAO;
import svm.persistence.abstraction.dao.IDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.IEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public abstract class AbstractModelDAO<T extends IModel, V extends IEntity> implements IModelDAO<T> {
    private IDAO<V> dao;

    public AbstractModelDAO(IDAO<V> dao) {
        this.dao = dao;
    }

    protected IDAO<V> getDAO() {
        return dao;
    }

    @Override
    public T getByUID(int sessionId, int id) throws NoSessionFoundException {
        return wrapObject(getDAO().getById(sessionId, id));
    }

    @Override
    public List<T> getAll(int sessionId) throws NoSessionFoundException {
        List<T> ret = new ArrayList<T>();
        for (V obj : dao.getAll(sessionId)) {
            ret.add(wrapObject(obj));
        }
        return ret;
    }

    @Override
    public void saveOrUpdate(int sessionId, T obj) throws NoSessionFoundException {
        dao.saveOrUpdate(sessionId, (V) ((IHasEntity) obj).getEntity());
    }

    @Override
    public T generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return wrapObject(dao.generateObject());
    }

    @Override
    public T generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return wrapObject(dao.generateObject(sessionId));
    }

    protected abstract T wrapObject(V Entity);
}
