import svm.domain.abstraction.DomainFacade;
import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.exception.DomainParameterCheckException;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;

/**
 * ProjectTeam: Team C
 * Date: 28.10.12
 */
public class Main {
    public static void main(String[] args) throws NoSessionFoundException, IllegalAccessException, InstantiationException, ExistingTransactionException, NoTransactionException, DomainException, DomainParameterCheckException {
        // Generate a session
        Integer sessionId = DomainFacade.generateSessionId();
//
//        // Get ModelDAO for Members
//        IMemberModelDAO dao = DomainFacade.getMemberModelDAO();
//        // Get a list of all Members
//        List<IMember> members = dao.get(sessionId, "Patrik","Jost");
//        // Iterate over all Members
//        for (IMember entity : members) {
//            // Get FirstName of Member
//            String firstName = entity.getFirstName();
//            // Get LastName of Member
//            String lastName = entity.getLastName();
//
//            System.out.println(firstName + " " + lastName);
//        }
//
//        System.out.println(members.get(0).hasPaidFee(2012));
//
//        IContestModelDAO dao2 = DomainFacade.getContestModelDAO();
//        startTransaction(sessionId);
//
//        List<IContest> contests = dao2.getAll(sessionId);
//
//        contests.get(1).setStart(new Date());
//        dao2.saveOrUpdate(sessionId,contests.get(1 ));
//
//        DomainFacade.commitTransaction(sessionId);

        /*
        // Generate a new Member Object
        IMember newMember = dao.generateObject();
        newMember.setFirstName("Thomas");
        newMember.setLastName("Feilhauer");
        // Rest of Attributes

        // Starts a Transaction for this Session
        DomainFacade.startTransaction(sessionId);
        // Save the Member to Database
        dao.saveOrUpdate(sessionId, newMember);
        // Commit the Transaction for this Session
        DomainFacade.commitTransaction(sessionId);
          */
        // Close Session


        IContest contest = DomainFacade.getContestModelDAO().getAll(sessionId).get(0);


        ITeam team = contest.getTeams().get(0);

        System.out.println("--------------------");
        for (ITeam t : contest.getTeams()){
            System.out.println(t.getName());
        }
        //contest.removeInternalTeam(team);
        DomainFacade.startTransaction(sessionId);
        DomainFacade.getContestModelDAO().saveOrUpdate(sessionId, contest);
        DomainFacade.commitTransaction(sessionId);

        System.out.println("--------------------");
        for (ITeam t : contest.getTeams()){
            System.out.println(t.getName());
        }



        DomainFacade.closeSession(sessionId);
    }
}
