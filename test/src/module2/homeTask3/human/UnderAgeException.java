package module2.homeTask3.human;

public class UnderAgeException extends Exception{
    public UnderAgeException() {
    }

    public UnderAgeException(String message) {
        super(message);
    }

    public UnderAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnderAgeException(Throwable cause) {
        super(cause);
    }

    public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
