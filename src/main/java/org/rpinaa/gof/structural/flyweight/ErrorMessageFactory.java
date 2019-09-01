package org.rpinaa.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import static org.rpinaa.gof.structural.flyweight.ErrorMessageFactory.ErrorType.*;

public class ErrorMessageFactory {

    public enum ErrorType {
        GENERIC_SYSTEM_ERROR, PAGE_NOT_FOUND_ERROR, SERVER_ERROR
    }

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        this.errorMessages.put(
                GENERIC_SYSTEM_ERROR,
                new SystemErrorMessage("A generic error of type $errorCode occurred", "http://google.com")
        );

        this.errorMessages.put(
                PAGE_NOT_FOUND_ERROR,
                new SystemErrorMessage("Page not found an $errorCode occurred", "http://google.com")
        );

        this.errorMessages.put(
                SERVER_ERROR,
                new SystemErrorMessage("A server error with code $errorCode occurred", "http://google.com")
        );
    }

    public SystemErrorMessage getError(ErrorType errorType) {
        return this.errorMessages.get(errorType);
    }

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

}
