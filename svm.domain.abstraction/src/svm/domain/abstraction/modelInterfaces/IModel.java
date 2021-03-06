package svm.domain.abstraction.modelInterfaces;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IModel extends Serializable, Remote {
    boolean isNull();

    Integer getUID();
}
