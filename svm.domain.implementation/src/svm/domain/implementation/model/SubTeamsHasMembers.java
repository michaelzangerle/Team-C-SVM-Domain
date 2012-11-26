package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMember;
import svm.domain.abstraction.modelInterfaces.ISubTeam;
import svm.domain.abstraction.modelInterfaces.ISubTeamsHasMembers;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;

// TODO Domain Logic Thomas

/**
 * ProjectTeam: Team C
 * Date: 01.11.12
 */
public class SubTeamsHasMembers implements IHasEntity<ISubTeamsHasMembersEntity>, ISubTeamsHasMembers {

    private ISubTeamsHasMembersEntity entity;

    public SubTeamsHasMembers(ISubTeamsHasMembersEntity entity) {
        this.entity = entity;
    }

    @Override
    public ISubTeam getSubTeam() {
        return new SubTeam(entity.getSubTeam());
    }

    @Override
    public void setSubTeam(ISubTeam subTeam) {
        this.entity.setSubTeam(((IHasEntity<ISubTeamEntity>) subTeam).getEntity());
    }

    @Override
    public IMember getMember() {
        return new Member(entity.getMember());
    }

    @Override
    public void setMember(IMember member) {
        this.entity.setMember(((IHasEntity<IMemberEntity>) member).getEntity());
    }

    @Override
    public Boolean isConfirmed() {
        return entity.isConfirmed();
    }

    @Override
    public void setConfirmed(boolean confirmed) {
        this.entity.setConfirmed(confirmed);
    }

    @Override
    public String getComment() {
        return entity.getComment();
    }

    @Override
    public void setComment(String comment) {
        entity.setComment(comment);
    }

    @Override
    public ISubTeamsHasMembersEntity getEntity() {
        return entity;
    }

    @Override
    public boolean isNull() {
        return entity == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamsHasMembers that = (SubTeamsHasMembers) o;

        if(this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }
}
