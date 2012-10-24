package svm.domain.abstraction.modelInterfaces;

import svm.domain.implementation.model.Contestant;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IPartResult {
    Float getResult();

    void setResult(Float result);

    Contestant getContestant();

    void setContestant(Contestant contestant);

    String getComment();

    void setComment(String comment);
}
