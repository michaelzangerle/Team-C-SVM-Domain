package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IPartResult;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class PartResult implements IPartResult {
    IPartResult partResult;

    public PartResult(IPartResult partResult) {
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
    public Contestant getContestant() {
        return partResult.contestant;
    }

    @Override
    public void setContestant(Contestant contestant) {
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
