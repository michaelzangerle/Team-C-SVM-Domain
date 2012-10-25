package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IPartResult;
import svm.persistence.abstraction.model.IPartResultEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class PartResult implements IPartResult {
    IPartResultEntity partResult;

    public PartResult(IPartResultEntity partResult) {
        this.partResult = partResult;
    }

    @Override
    public Float getResult() {
        return partResult.result;
    }

    @Override
    public void setResult(Float result) {
        this.partResult.result = result;
    }

    @Override
    public IContestant getContestant() {
        return partResult.contestant;
    }

    @Override
    public void setContestant(IContestant contestant) {
        this.partResult.contestant = contestant;
    }

    @Override
    public String getComment() {
        return partResult.comment;
    }

    @Override
    public void setComment(String comment) {
        this.partResult.comment = comment;
    }
}
