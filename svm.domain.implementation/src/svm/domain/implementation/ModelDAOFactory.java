package svm.domain.implementation;

import svm.domain.abstraction.modeldao.*;
import svm.domain.implementation.modeldao.*;
import svm.persistence.abstraction.dao.IUserPrivilegeDAO;
import svm.persistence.hibernate.dao.UserPrivilegeDAO;

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

    /**
     * Returns a ContestHasTeams ModelDAO
     *
     * @return IContestModelDAO
     */
    public IContestsHasTeamsModelDao getContestHasTeamsModelDao() {
        return (IContestsHasTeamsModelDao) getDAO(ContestHasTeamsModelDAO.class);
    }


    /**
     * Returns a ContactDetails ModelDAO
     *
     * @return IContactDetailsModelDAO
     */
    public IContactDetailsModelDAO getContactDetailsModelDAO() {
        return (IContactDetailsModelDAO) getDAO(ContactDetailsModelDAO.class);
    }

    /**
     * Returns a Location ModelDAO
     *
     * @return ILocationModelDAO
     */
    public ILocationModelDAO getLocationModelDAO() {
        return (ILocationModelDAO) getDAO(LocationModelDAO.class);
    }

    /**
     * Returns a Member ModelDAO
     *
     * @return IMemberModelDAO
     */
    public IMemberModelDAO getMemberModelDAO() {
        return (IMemberModelDAO) getDAO(MemberModelDAO.class);
    }

    /**
     * Returns a Department ModelDAO
     *
     * @return IDepartmentModelDAO
     */
    public IDepartmentModelDAO getDepartmentModelDAO() {
        return (IDepartmentModelDAO) getDAO(DepartmentModelDAO.class);
    }

    /**
     * Returns a SubTeam ModelDAO
     *
     * @return ISubTeamModelDAO
     */
    public ISubTeamModelDAO getSubTeamModelDAO() {
        return (ISubTeamModelDAO) getDAO(SubTeamModelDAO.class);
    }

    /**
     * Returns a SubTeamsHasMembers ModelDAO
     *
     * @return ISubTeamsHasMembersModelDAO
     */
    public ISubTeamsHasMembersModelDAO getSubTeamsHasMembersModelDAO() {
        return (ISubTeamsHasMembersModelDAO) getDAO(SubTeamsHasMembersModelDAO.class);
    }

    /**
     * Returns a Match ModelDAO
     *
     * @return IMatchModelDAO
     */
    public IMatchModelDAO getMatchModelDAO() {
        return (IMatchModelDAO) getDAO(MatchModelDAO.class);
    }

    /**
     * Returns a Team ModelDAO
     *
     * @return ISubTeamModelDAO
     */
    public ITeamModelDAO getTeamModelDAO() {
        return (ITeamModelDAO) getDAO(TeamModelDAO.class);
    }

    /**
     * Returns a ExternalTeam ModelDAO
     *
     * @return ISubTeamModelDAO
     */
    public IExternalTeamModelDAO getExternalTeamModelDAO() {
        return (IExternalTeamModelDAO) getDAO(ExternalTeamModelDAO.class);
    }

    public IUserPrivilegeDAO getUserPrivilegeDAO() {
        return (IUserPrivilegeDAO) getDAO(UserPrivilegeDAO.class);
    }
}
