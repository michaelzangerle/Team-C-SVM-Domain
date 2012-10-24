package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Patrick
 * Date: 24.10.12
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
public class MatchType {

    IMatchTypeEntity matchTypeEntity;

    public MatchType(IMatchTypeEntity matchTypeEntity) {
        this.matchTypeEntity = matchTypeEntity;
    }

    public String getName() {
        return matchTypeEntity.name;
    }

    public void setName(String name) {
        this.matchTypeEntity.name = name;
    }

    public String getDescription() {
        return matchTypeEntity.description;
    }

    public void setDescription(String description) {
        this.matchTypeEntity.description = description;
    }

    public int getDraw() {
        return matchTypeEntity.draw;
    }

    public void setDraw(int draw) {
        this.matchTypeEntity.draw = draw;
    }

    public int getWin() {
        return matchTypeEntity.win;
    }

    public void setWin(int win) {
        this.matchTypeEntity.win = win;
    }

    public int getLose() {
        return matchTypeEntity.lose;
    }

    public void setLose(int lose) {
        this.matchTypeEntity.lose = lose;
    }
}
