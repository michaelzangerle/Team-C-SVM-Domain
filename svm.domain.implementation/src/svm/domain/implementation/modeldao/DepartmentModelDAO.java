package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IDepartment;
import svm.domain.abstraction.modeldao.IDepartmentModelDAO;
import svm.domain.implementation.model.Department;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IDepartmentEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class DepartmentModelDAO extends AbstractModelDAO<IDepartment, IDepartmentEntity> implements IDepartmentModelDAO {
    public DepartmentModelDAO() {
        super(PersistenceFacade.getDepartmentDAO());
    }

    @Override
    protected IDepartment wrapObject(IDepartmentEntity Entity) {
        return new Department(Entity);
    }
}
