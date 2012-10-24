package svm.domain.abstraction.modelInterfaces;

import java.util.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ITeam {
    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    Date getFounded();

    void setFounded(Date founded);

    ISport getSport();

    void setSport(ISport ISport);

    ITeamType getTeamType();

    void setTeamType(ITeamType ITeamType);

    IMember getContactPerson();

    void setContactPerson(IMember contactPerson);
}
