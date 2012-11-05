package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface ILocationModelDAO extends IModelDAO<ILocation> {
    List<ILocation> findByName(int sessionId, String placeName) throws NoSessionFoundException;

    List<ILocation> get(int sessionId, String country, String district) throws NoSessionFoundException;
}
