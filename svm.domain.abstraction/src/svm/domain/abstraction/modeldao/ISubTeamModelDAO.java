package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public interface ISubTeamModelDAO extends IModelDAO<ISubTeam> {
    ISubTeam get(Integer sessionId, ITeam team, IContest contest) throws NoSessionFoundException, DomainException, NotSupportedException, IllegalAccessException, InstantiationException;
}
