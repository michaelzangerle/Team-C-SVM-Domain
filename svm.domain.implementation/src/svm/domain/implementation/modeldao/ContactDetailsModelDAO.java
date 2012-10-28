package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.domain.abstraction.modeldao.IContactDetailsModelDAO;
import svm.domain.implementation.ModelDAOFactory;
import svm.domain.implementation.model.ContactDetails;
import svm.domain.implementation.model.Location;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContactDetailsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class ContactDetailsModelDAO extends AbstractModelDAO<IContactDetails, IContactDetailsEntity> implements IContactDetailsModelDAO {
    public ContactDetailsModelDAO() {
        super(PersistenceFacade.getContactDetailsDAO());
    }

    @Override
    public List<IContactDetails> findByPlaceName(int sessionId, String placeName) throws NoSessionFoundException {
        List<IContactDetails> ret = new ArrayList<IContactDetails>();
        for (ILocation location : ModelDAOFactory.getInstance().getLocationModelDAO().findByName(sessionId, placeName)) {
            for (IContactDetailsEntity obj : getDAO().find(sessionId, "location", FindQualifiers.EQUALS, String.valueOf(((Location) location).getEntity().getId()))) {
                ret.add(wrapObject(obj));
            }
        }
        return ret;
    }

    @Override
    protected ContactDetails wrapObject(IContactDetailsEntity Entity) {
        return new ContactDetails(Entity);
    }
}
