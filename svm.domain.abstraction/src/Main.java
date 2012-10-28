import svm.domain.abstraction.DomainFacade;
import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.Date;

/**
 * ProjectTeam: Team C
 * Date: 28.10.12
 */
public class Main {
    public static void main(String[] args) throws NoSessionFoundException {
        Integer sessionId = DomainFacade.generateSessionId();

        Long t1 = new Date().getTime();
        for (IContactDetails c : DomainFacade.getContactDetailsModelDAO().getAll(sessionId)) {
            System.out.println(c.getLocation().getPlaceName());
        }
        Long t2 = new Date().getTime();

        DomainFacade.closeSession(sessionId);

        System.out.println(t2 - t1);
    }
}
