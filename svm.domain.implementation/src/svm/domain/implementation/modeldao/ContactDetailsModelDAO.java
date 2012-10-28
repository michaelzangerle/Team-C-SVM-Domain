package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.domain.abstraction.modeldao.IContactDetailsModelDAO;
import svm.domain.implementation.model.ContactDetails;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContactDetailsEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class ContactDetailsModelDAO extends AbstractModelDAO<IContactDetails, IContactDetailsEntity> implements IContactDetailsModelDAO {
    public ContactDetailsModelDAO() {
        super(PersistenceFacade.getContactDetailsDAO());
    }

    @Override
    protected ContactDetails wrapObject(IContactDetailsEntity Entity) {
        return new ContactDetails(Entity);
    }
}
