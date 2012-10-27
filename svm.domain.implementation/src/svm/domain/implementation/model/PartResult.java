package svm.domain.implementation.model;

import svm.domain.abstraction.modelInterfaces.IContestant;
import svm.domain.abstraction.modelInterfaces.IHasEntity;
import svm.domain.abstraction.modelInterfaces.IPartResult;
import svm.persistence.abstraction.model.IPartResultEntity;

/**
 * Projectteam
 * Date: 21.10.12
 */
public class PartResult implements IPartResult,IHasEntity<IPartResultEntity> {
    IPartResultEntity partResultEntity;

    public PartResult(IPartResultEntity partResult) {
        this.partResultEntity = partResult;
    }

    @Override
    public Float getResult() {
        return partResultEntity.getResult();
    }

    @Override
    public void setResult(Float result) {
        this.partResultEntity.setResult(result);
    }

    @Override
    public IContestant getContestant() {
        return new Contestant(partResultEntity.getContestant());

    }

    @Override
    public void setContestant(IContestant contestant) {
        this.partResultEntity.setContestant(((Contestant)contestant).getEntity());
    }

    @Override
    public String getComment() {
        return partResultEntity.getComment();
    }

    @Override
    public void setComment(String comment) {
        this.partResultEntity.setComment(comment);
    }

    @Override
    public IPartResultEntity getEntity() {
        return partResultEntity;
    }
}
