package svm.domain.abstraction.modelInterfaces;

import svm.domain.abstraction.exception.DomainException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMatchTypeEntity;

import java.util.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMatch extends IModel {
    String getName();

    void setName(String name);

    Date getStart();

    void setStart(Date start);

    Date getEnd();

    void setEnd(Date end);

    Boolean getCancelled();

    void setCancelled(Boolean cancelled);

    String getRemarks();

    void setRemarks(String remarks);

    IContactDetails getContactDetails();

    void setContactDetails(IContactDetails IContactDetails);

    String getDescription();

    void setDescription(String description);

    void setMatchType(IMatchType matchType);

    IMatchType getMatchType();

    List<IContestant> getContestants();

    void setContestants(ITeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException;

    void setContestants(IExternalTeam home, ITeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException;

    void setContestants(ITeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException;

    void setContestants(IExternalTeam home, IExternalTeam away) throws NoSessionFoundException, InstantiationException, IllegalAccessException;

    void addResult(Float home, Float away) throws DomainException, NoSessionFoundException, IllegalAccessException, InstantiationException;

    void setResult(Float home, Float away) throws DomainException, NoSessionFoundException, InstantiationException, IllegalAccessException;

}
