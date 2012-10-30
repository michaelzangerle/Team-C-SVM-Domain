package svm.domain.abstraction.exception;

/**
 * Projectteam : Team C
 * Date: 30.10.12
 */
public class DomainParameterCheckException extends DomainException {

    public DomainParameterCheckException(String message) {
        super(message);
    }

    public DomainParameterCheckException() {
    }

    public DomainParameterCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainParameterCheckException(Throwable cause) {
        super(cause);
    }

    public DomainParameterCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
