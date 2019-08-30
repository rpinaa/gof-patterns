package org.rpinaa.gof.structural.decorator;

public class TextMessage implements Message {

    private String message;

    public TextMessage(final String message) {
        this.message =  message;
    }

    @Override
    public String getContent() {
        return this.message;
    }
}
