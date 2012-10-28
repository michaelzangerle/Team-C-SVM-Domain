package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.modelInterfaces.IContactDetails;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IContactDetailsModelDAO extends IModelDAO<IContactDetails> {
    List<IContactDetails> findByPlaceName(int sessionId, String placeName) throws NoSessionFoundException;
}
