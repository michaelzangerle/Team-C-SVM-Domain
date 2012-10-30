package svm.domain.implementation.modeldao;

import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modeldao.IMemberModelDAO;
import svm.domain.implementation.model.Member;
import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IMemberEntity;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public class MemberModelDAO extends AbstractModelDAO<IMember, IMemberEntity> implements IMemberModelDAO {
    public MemberModelDAO() {
        super(PersistenceFacade.getMemberDAO());
    }

    @Override
    protected IMember wrapObject(IMemberEntity Entity) {
        return new Member(Entity);
    }
}
