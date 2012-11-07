package svm.domain.abstraction;

import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modeldao.IMemberModelDAO;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;

import javax.transaction.NotSupportedException;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 06.11.12
 */
public class MemberMain {

    public static void main(String[] args) throws NoSessionFoundException, ExistingTransactionException, NoTransactionException, InstantiationException, IllegalAccessException, NotSupportedException {
        // Generate a session
        Integer sessionId = DomainFacade.generateSessionId();

        // Get ModelDAO for Members
        IMemberModelDAO dao = DomainFacade.getMemberModelDAO();
        // Get a list of all Members
        List<IMember> members = dao.get(sessionId, "", "Zangerle");
        // Iterate over all Members
        for (IMember entity : members) {
            // Get FirstName of Member
            String firstName = entity.getFirstName();
            // Get LastName of Member
            String lastName = entity.getLastName();

            System.out.println(firstName + " " + lastName);
        }

        DomainFacade.startTransaction(sessionId);

        members.get(0).setPaidCurrentYear();

        DomainFacade.getMemberModelDAO().saveOrUpdate(sessionId, members.get(0));
        DomainFacade.commitTransaction(sessionId);

    }
}
