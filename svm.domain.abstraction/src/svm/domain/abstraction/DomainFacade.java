package svm.domain.abstraction;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IModel;
import svm.domain.abstraction.modeldao.*;
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
     * Reattach Object to a Session
     *
     * @param sessionId SessionID
     * @param entity    Entity
     */
    public static void reattachObjectToSession(Integer sessionId, IModel entity) throws NoSessionFoundException {
        PersistenceFacade.reattachObjectToSession(sessionId, ((IHasEntity) entity).getEntity());
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

    /**
     * Returns a Location ModelDAO
     *
     * @return ILocationModelDAO
     */
    public static ILocationModelDAO getLocationModelDAO() {
        return ModelDAOFactory.getInstance().getLocationModelDAO();
    }

    /**
     * Returns a Member ModelDAO
     *
     * @return IMemberModelDAO
     */
    public static IMemberModelDAO getMemberModelDAO() {
        return ModelDAOFactory.getInstance().getMemberModelDAO();
    }

    /**
     * Returns a Department ModelDAO
     *
     * @return IDepartmentModelDAO
     */
    public static IDepartmentModelDAO getDepartmentModelDAO() {
        return ModelDAOFactory.getInstance().getDepartmentModelDAO();
    }

    /**
     * Returns a SubTeam ModelDAO
     *
     * @return ISubTeamModelDAO
     */
    public static ISubTeamModelDAO getSubTeamModelDAO() {
        return ModelDAOFactory.getInstance().getSubTeamModelDAO();
    }

    /**
     * Returns a ContestHasTeams ModelDAO
     *
     * @return ISubTeamModelDAO
     */
    public static IContestsHasTeamsModelDao getContestsHasTeamsDAO() {
        return ModelDAOFactory.getInstance().getContestHasTeamsModelDao();
    }

    /**
     * Returns a Match ModelDAO
     *
     * @return IMatchModelDAO
     */
    public static IMatchModelDAO getMatchModelDAO() {
        return ModelDAOFactory.getInstance().getMatchModelDAO();
    }

    /**
     * Returns a Team ModelDAO
     *
     * @return IMatchModelDAO
     */
    public static ITeamModelDAO getTeamModelDAO() {
        return ModelDAOFactory.getInstance().getTeamModelDAO();
    }

    /**
     * Returns a Team ModelDAO
     *
     * @return IMatchModelDAO
     */
    public static IExternalTeamModelDAO getExternalTeamModelDAO() {
        return ModelDAOFactory.getInstance().getExternalTeamModelDAO();
    }

    public static IUserPrivilegeModelDAO getUserPrivilegeModelDAO() {
        return ModelDAOFactory.getInstance().getUserPrivilegeDAO();
    }

    public static ISportModelDAO getSportModelDAO() {
        return ModelDAOFactory.getInstance().getSportModelDAO();
    }

    //endregion
}
