package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMatchType extends IModel {
    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    int getDraw();

    void setDraw(int draw);

    int getWin();

    void setWin(int win);

    int getLose();

    void setLose(int lose);
}
