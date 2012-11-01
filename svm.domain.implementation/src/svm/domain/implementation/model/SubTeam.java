package svm.domain.implementation.model;

import svm.domain.abstraction.exception.DomainException;
import svm.domain.abstraction.modelInterfaces.*;
import svm.domain.implementation.ModelDAOFactory;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;
import svm.persistence.abstraction.model.ITeamEntity;

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

    public void addMember(IMember member) throws DomainException, NoSessionFoundException, IllegalAccessException, InstantiationException {
        // Check if Member is in Team
        if (getTeam().isMember(member)) {
            // Generate new Connection between Member and SubTeam
            ISubTeamsHasMembers tmp = ModelDAOFactory.getInstance().getSubTeamsHasMembersModelDAO().generateObject();
            tmp.setMember(member);
            tmp.setSubTeam(this);
            // Add this Connection
            this.getSubTeamMembers().add(tmp);
        } else {
            throw new DomainException("Person is not a Member of Team");
        }
    }

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
}