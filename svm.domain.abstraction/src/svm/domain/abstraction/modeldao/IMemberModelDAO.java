package svm.domain.abstraction.modeldao;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;

import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public interface IMemberModelDAO extends IModelDAO<IMember> {
    List<IMember> get(Integer sessionId, String firstName, String lastName, IDepartment department) throws NoSessionFoundException;
}
