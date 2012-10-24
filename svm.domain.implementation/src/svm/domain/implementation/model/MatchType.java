package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IMatchType;

/**
 * Created with IntelliJ IDEA.
 * User: Patrick
 * Date: 24.10.12
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
public class MatchType implements IMatchType {

    IMatchTypeEntity matchTypeEntity;

    public MatchType(IMatchTypeEntity matchTypeEntity) {
        this.matchTypeEntity = matchTypeEntity;
    }

    @Override
    public String getName() {
        return matchTypeEntity.name;
    }

    @Override
    public void setName(String name) {
        this.matchTypeEntity.name = name;
    }

    @Override
    public String getDescription() {
        return matchTypeEntity.description;
    }

    @Override
    public void setDescription(String description) {
        this.matchTypeEntity.description = description;
    }

    @Override
    public int getDraw() {
        return matchTypeEntity.draw;
    }

    @Override
    public void setDraw(int draw) {
        this.matchTypeEntity.draw = draw;
    }

    @Override
    public int getWin() {
        return matchTypeEntity.win;
    }

    @Override
    public void setWin(int win) {
        this.matchTypeEntity.win = win;
    }

    @Override
    public int getLose() {
        return matchTypeEntity.lose;
    }

    @Override
    public void setLose(int lose) {
        this.matchTypeEntity.lose = lose;
    }
}
