package svm.domain.implementation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
public class MatchType {
    enum alias{};
    String name;
    String description;
    int draw;
    int win;
    int lose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }
}
