package svm.domain.abstraction;

import svm.domain.abstraction.modeldao.IContactDetailsModelDAO;
import svm.domain.abstraction.modeldao.IContestModelDAO;
import svm.domain.implementation.ModelDAOFactory;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class DomainFacade {

    //region Hibernate Session / Transaction

    /**
     * Generates a new Session for returned ID
     *
     * @return new Session ID
     */
    public static Integer generateSessionId() {
        return PersistenceFacade.generateSessionId();
    }

    /**
     * Closes Session for given Id
     *
     * @param sessionId Session ID
     * @throws svm.persistence.abstraction.exceptions.NoSessionFoundException
     *          No Session found for this ID
     */
    public static void closeSession(Integer sessionId) throws NoSessionFoundException {
        PersistenceFacade.closeSession(sessionId);
    }

    /**
     * Returns true if Session exists for given Id
     *
     * @param sessionId Session Id
     * @return Session exists
     */
    public static boolean hasSession(Integer sessionId) {
        return PersistenceFacade.hasSession(sessionId);
    }

    /**
     * Returns true if Session Transaction exists for given Id
     *
     * @param sessionId Session Id
     * @return Session exists
     * @throws NoSessionFoundException No Session found for this Id
     */
    public static boolean hasTransaction(Integer sessionId) throws NoSessionFoundException {
        return PersistenceFacade.hasTransaction(sessionId);
    }

    /**
     * Start a Transaction for given Session ID
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this ID
     * @throws svm.persistence.abstraction.exceptions.ExistingTransactionException
     *                                 Existing Transaction found for this ID
     */
    public static void startTransaction(Integer sessionId) throws NoSessionFoundException, ExistingTransactionException {
        PersistenceFacade.startTransaction(sessionId);
    }

    /**
     * Commit Session Transaction for given Id
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this Id
     * @throws svm.persistence.abstraction.exceptions.NoTransactionException
     *                                 No Transaction found for this Session
     */
    public static void commitTransaction(Integer sessionId) throws NoSessionFoundException, NoTransactionException {
        PersistenceFacade.commitTransaction(sessionId);
    }

    /**
     * Abort Session Transaction for given Id
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this Id
     * @throws NoTransactionException  No Transaction found for this Session
     */
    public static void abortTransaction(Integer sessionId) throws NoSessionFoundException, NoTransactionException {
        PersistenceFacade.abortTransaction(sessionId);
    }
    //endregion

    //region getModelDAOS

    /**
     * Returns a Contest ModelDAO
     *
     * @return IContestModelDAO
     */
    public static IContestModelDAO getContestModelDAO() {
        return ModelDAOFactory.getInstance().getContestModelDAO();
    }

    /**
     * Returns a ContactDetails ModelDAO
     *
     * @return IContactDetailsModelDAO
     */
    public static IContactDetailsModelDAO getContactDetailsModelDAO() {
        return ModelDAOFactory.getInstance().getContactDetailsModelDAO();
    }
    //endregion
}
