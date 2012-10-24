package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContestant;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class PartResult {
    IPartResult partResult;

    public PartResult(IPartResult partResult) {
        this.partResult = partResult;
    }

    public Float getResult() {
        return partResult.result;
    }

    public void setResult(Float result) {
        this.partResult.result = result;
    }

    public IContestant getContestant() {
        return partResult.contestant;
    }

    public void setContestant(IContestant IContestant) {
        this.partResult.contestant = IContestant;
    }

    public String getComment() {
        return partResult.comment;
    }

    public void setComment(String comment) {
        this.partResult.comment = comment;
    }
}
