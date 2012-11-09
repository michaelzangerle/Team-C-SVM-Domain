import svm.domain.abstraction.DomainFacade;
import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.domain.abstraction.modeldao.ISubTeamModelDAO;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

/**
 * ProjectTeam: Team C
 * Date: 08.11.12
 */
public class Hannes {
    public static void main(String[] args) throws NoSessionFoundException, NotSupportedException, DomainException, InstantiationException, IllegalAccessException, NoTransactionException, ExistingTransactionException {
        Integer sessionId = DomainFacade.generateSessionId();
        ITeam team = DomainFacade.getTeamModelDAO().getAll(sessionId).get(0);
        IContest contest = DomainFacade.getContestModelDAO().getAll(sessionId).get(0);
        ISubTeamModelDAO dao = DomainFacade.getSubTeamModelDAO();
        ISubTeam subTeam = dao.get(sessionId, team, contest);
        System.out.println(subTeam.getName());
        DomainFacade.startTransaction(sessionId);
        dao.saveOrUpdate(sessionId, subTeam);
        DomainFacade.commitTransaction(sessionId);
        DomainFacade.closeSession(sessionId);
    }
}
