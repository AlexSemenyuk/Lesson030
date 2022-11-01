package org.itstep.task04;

public class ArraysNotSortException extends Exception {
    public ArraysNotSortException() {
    }

    public ArraysNotSortException(String message) {
        super(message);
    }

    public ArraysNotSortException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraysNotSortException(Throwable cause) {
        super(cause);
    }

    public ArraysNotSortException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
