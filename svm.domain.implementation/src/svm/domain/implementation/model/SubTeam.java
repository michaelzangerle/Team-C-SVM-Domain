package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.domain.implementation.ModelDAOFactory;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.*;

import java.util.LinkedList;
import java.util.List;

// TODO Domain Logic Thomas

/**
 * ProjectTeam: Team C
 * Date: 01.11.12
 */
public class SubTeam implements IHasEntity<ISubTeamEntity>, ISubTeam {

    private ISubTeamEntity subTeam;

    public SubTeam(ISubTeamEntity subTeam) {
        this.subTeam = subTeam;
    }

    @Override
    public String getName() {
        return subTeam.getName();
    }

    @Override
    public void setName(String name) {
        subTeam.setName(name);
    }

    @Override
    public IContest getContest() {
        return new Contest(subTeam.getContest());
    }

    @Override
    public void setContest(IContest contest) {
        subTeam.setContest(((IHasEntity<IContestEntity>) contest).getEntity());
    }

    @Override
    public ITeam getTeam() {
        return new Team(subTeam.getTeam());
    }

    @Override
    public void setTeam(ITeam contest) {
        subTeam.setTeam(((IHasEntity<ITeamEntity>) contest).getEntity());
    }

    @Override
    public void addMember(IMember member) throws DomainException, NoSessionFoundException, IllegalAccessException, InstantiationException, svm.persistence.abstraction.exceptions.NotSupportedException, NotSupportedException {
        // Check if Member is in Team
        if (getTeam().isMember(member)) {
            if (!isMember(member)) {
                // Generate new Connection between Member and SubTeam
                ISubTeamsHasMembersEntity tmp = (ISubTeamsHasMembersEntity) ((IHasEntity) ModelDAOFactory.getInstance().getSubTeamsHasMembersModelDAO().generateObject()).getEntity();
                tmp.setMember((IMemberEntity) ((IHasEntity) member).getEntity());
                tmp.setSubTeam(this.getEntity());
                // Add this Connection
                if (subTeam.getSubTeamsHasMembers() == null) {
                    subTeam.setSubTeamsHasMembers(new LinkedList<ISubTeamsHasMembersEntity>());
                }
                this.subTeam.getSubTeamsHasMembers().add(tmp);
                ((IMemberEntity) ((IHasEntity) member).getEntity()).getSubTeamHasMember().add(tmp);
            } else {
                throw new DomainException("Person is already a Member of SubTeam");
            }
        } else {
            throw new DomainException("Person is not a Member of Team");
        }
    }

    @Override
    public Boolean isMember(IMember member) {
        if (subTeam.getSubTeamsHasMembers() == null) return false;
        for (ISubTeamsHasMembersEntity entity : subTeam.getSubTeamsHasMembers()) {
            if (entity.getMember().getId() == ((IHasEntity) member).getEntity().getId()) return true;
        }
        return false;
    }

    @Override
    public void removeMember(IMember member) {
        ISubTeamsHasMembersEntity toRemove = null;
        // Search for member in List
        for (ISubTeamsHasMembersEntity entity : subTeam.getSubTeamsHasMembers()) {
            if (entity.getMember().equals(member)) {
                toRemove = entity;
                break;
            }
        }
        // If found remove from List
        if (toRemove != null) subTeam.getSubTeamsHasMembers().remove(toRemove);
    }

    @Override
    public List<ISubTeamsHasMembers> getSubTeamMembers() {
        List<ISubTeamsHasMembers> members = new LinkedList<ISubTeamsHasMembers>();
        for (ISubTeamsHasMembersEntity entity : subTeam.getSubTeamsHasMembers()) {
            members.add(new SubTeamsHasMembers(entity));
        }
        return members;
    }

    @Override
    public ISubTeamEntity getEntity() {
        return subTeam;
    }

    @Override
    public boolean isNull() {
        return subTeam == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeam that = (SubTeam) o;

        if (this.getEntity().getId() == that.getEntity().getId())
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getEntity().getId();
    }

}
