package svm.domain.abstraction.exception;

/**
 * Projectteam : Team C
 * Date: 30.10.12
 */
public abstract class DomainException extends Exception {

    protected DomainException() {
    }

    protected DomainException(String message) {
        super(message);
    }

    protected DomainException(String message, Throwable cause) {
        super(message, cause);
    }

    protected DomainException(Throwable cause) {
        super(cause);
    }

    protected DomainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
