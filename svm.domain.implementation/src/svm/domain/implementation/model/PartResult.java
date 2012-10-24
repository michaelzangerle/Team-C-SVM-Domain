package svm.domain.implementation.model;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class PartResult {
    Float result;
    Contestant contestant;
    String comment;

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    public Contestant getContestant() {
        return contestant;
    }

    public void setContestant(Contestant contestant) {
        this.contestant = contestant;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
