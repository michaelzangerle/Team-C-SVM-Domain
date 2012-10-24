package svm.domain.abstraction.modelInterfaces;

/**
 * Created with IntelliJ IDEA.
 * User: Tobias
 * Date: 24.10.12
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public interface IMatchType {
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
