package org.rpinaa.gof.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {

    private String helpBaseURL;
    private String messageTemplate;

    public SystemErrorMessage(String messageTemplate, String helpBaseURL) {
        this.helpBaseURL = helpBaseURL;
        this.messageTemplate = messageTemplate;
    }

    @Override
    public String getText(String code) {
        return this.messageTemplate.replace("$errorCode", code) +  this.helpBaseURL + code;
    }
}
