package com.plohiya.SpringBoot.error;

public class DepeartmentNotFoundException extends Exception{
    public DepeartmentNotFoundException() {
        super();
    }

    public DepeartmentNotFoundException(String message) {
        super(message);
    }

    public DepeartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepeartmentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DepeartmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
