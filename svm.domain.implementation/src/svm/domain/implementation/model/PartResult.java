package svm.domain.implementation.model;

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

    public Contestant getContestant() {
        return partResult.contestant;
    }

    public void setContestant(Contestant contestant) {
        this.partResult.contestant = contestant;
    }

    public String getComment() {
        return partResult.comment;
    }

    public void setComment(String comment) {
        this.partResult.comment = comment;
    }
}
