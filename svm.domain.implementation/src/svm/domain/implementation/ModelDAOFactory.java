package svm.domain.implementation;

import svm.domain.abstraction.modeldao.IContestModelDAO;
import svm.domain.abstraction.modeldao.IModelDAO;
import svm.domain.implementation.modeldao.ContestModelDAO;
import svm.persistence.abstraction.dao.IContactDetailsDAO;
import svm.persistence.abstraction.dao.IContestDAO;
import svm.persistence.abstraction.dao.IDAO;
import svm.persistence.hibernate.dao.ContactDetailsDAO;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class ModelDAOFactory {
    private static ModelDAOFactory instance;

    public static ModelDAOFactory getInstance() {
        if (instance == null) {
            instance = new ModelDAOFactory();
        }
        return instance;
    }

    private HashMap<Class, IModelDAO> daos = new HashMap<Class, IModelDAO>();

    /**
     * Generates a SingleTon DAO Object for given Class
     *
     * @param aClass DAO Object Class
     * @return DAO Object
     */
    private IModelDAO getDAO(Class aClass) {
        try {
            if (!daos.containsKey(aClass)) {
                daos.put(aClass, (IModelDAO) aClass.newInstance());
            }
            return daos.get(aClass);
        } catch (ReflectiveOperationException ex) {
            Logger.getLogger("Persistence").log(Level.WARNING, "Class PersonDAO not found: " + ex.getMessage());
            return null;
        } catch (ClassCastException ex) {
            Logger.getLogger("Persistence").log(Level.WARNING, "Cannot cast Class: " + ex.getMessage());
            return null;
        }
    }

    /**
     * Returns a Contest ModelDAO
     *
     * @return IContestModelDAO
     */
    public IContestModelDAO getContestModelDAO() {
        return (IContestModelDAO) getDAO(ContestModelDAO.class);
    }
}
