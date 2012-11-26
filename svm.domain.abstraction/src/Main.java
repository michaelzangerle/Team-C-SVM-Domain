import svm.domain.abstraction.DomainFacade;
import svm.domain.abstraction.exception.DomainAttributeException;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modeldao.IMemberModelDAO;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 28.10.12
 */
public class Main {
    public static void main(String[] args) throws NoSessionFoundException, IllegalAccessException, InstantiationException, ExistingTransactionException, NoTransactionException, DomainAttributeException {
        // Generate a session
        Integer sessionId = DomainFacade.generateSessionId();

        // Get ModelDAO for Members
        IMemberModelDAO dao = DomainFacade.getMemberModelDAO();
        // Get a list of all Members
        List<IMember> members = dao.getAll(sessionId);
        // Iterate over all Members
        for (IMember entity : members) {
            // Get FirstName of Member
            String firstName = entity.getFirstName();
            // Get LastName of Member
            String lastName = entity.getLastName();

            System.out.println(firstName + " " + lastName);
        }

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

        // Close Session
        DomainFacade.closeSession(sessionId);
    }
}
