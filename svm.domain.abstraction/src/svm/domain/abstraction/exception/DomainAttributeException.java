package svm.domain.abstraction.exception;

import java.rmi.Remote;

/**
 * Projectteam : Team C
 * Date: 30.10.12
 */
public class DomainAttributeException extends DomainException implements Remote {

    public DomainAttributeException() {
    }

    public DomainAttributeException(String message) {
        super(message);
    }

    public DomainAttributeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainAttributeException(Throwable cause) {
        super(cause);
    }

    public DomainAttributeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
