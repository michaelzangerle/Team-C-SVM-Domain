package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IPartResult extends IModel {
    Float getResult();

    void setResult(Float result);

    IContestant getContestant();

    void setContestant(IContestant contestant);

    String getComment();

    void setComment(String comment);
}
