package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IMatchType;
import svm.persistence.abstraction.model.IMatchTypeEntity;

/**
 * Projectteam Team C
 * Date: 21.10.12
 */
public class MatchType implements IMatchType, IHasEntity<IMatchTypeEntity> {

    IMatchTypeEntity matchTypeEntity;

    public MatchType(IMatchTypeEntity matchTypeEntity) {
        this.matchTypeEntity = matchTypeEntity;
    }

    @Override
    public String getName() {
        return matchTypeEntity.getName();
    }

    @Override
    public void setName(String name) {
        this.matchTypeEntity.setName(name);
    }

    @Override
    public String getDescription() {
        return matchTypeEntity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.matchTypeEntity.setDescription(description);
    }

    @Override
    public int getDraw() {
        return matchTypeEntity.getDraw();
    }

    @Override
    public void setDraw(int draw) {
        this.matchTypeEntity.setDraw(draw);
    }

    @Override
    public int getWin() {
        return matchTypeEntity.getWin();
    }

    @Override
    public void setWin(int win) {
        this.matchTypeEntity.setWin(win);
    }

    @Override
    public int getLose() {
        return matchTypeEntity.getLose();
    }

    @Override
    public void setLose(int lose) {
        this.matchTypeEntity.setLose(lose);
    }

    @Override
    public IMatchTypeEntity getEntity() {
        return matchTypeEntity;
    }
}
