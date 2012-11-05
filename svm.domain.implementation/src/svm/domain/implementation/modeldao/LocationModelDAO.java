package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.ILocation;
import svm.domain.abstraction.modeldao.ILocationModelDAO;
import svm.domain.implementation.model.Location;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.ILocationEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class LocationModelDAO extends AbstractModelDAO<ILocation, ILocationEntity> implements ILocationModelDAO {
    public LocationModelDAO() {
        super(PersistenceFacade.getLocationDAO());
    }

    @Override
    public List<ILocation> findByName(int sessionId, String placeName) throws NoSessionFoundException {
        List<ILocation> ret = new ArrayList<ILocation>();
        for (ILocationEntity obj : getDAO().find(sessionId, new CompareObject("placeName", FindQualifiers.EQUALS, placeName))) {
            ret.add(wrapObject(obj));
        }
        return ret;
    }

    @Override
    public List<ILocation> get(int sessionId, String country, String district) throws NoSessionFoundException {
        CompareObject[] compares = new CompareObject[2];
        compares[0] = new CompareObject("countryCode", FindQualifiers.EQUALS, country);
        compares[1] = new CompareObject("district", FindQualifiers.EQUALS, district);

        List<ILocation> ret = new ArrayList<ILocation>();
        for (ILocationEntity obj : getDAO().find(sessionId, compares)) {
            ret.add(wrapObject(obj));
        }
        return ret;
    }

    @Override
    protected ILocation wrapObject(ILocationEntity Entity) {
        return new Location(Entity);
    }
}
