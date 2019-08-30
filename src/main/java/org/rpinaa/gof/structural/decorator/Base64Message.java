package org.rpinaa.gof.structural.decorator;

import java.util.Base64;

public class Base64Message implements Message {

    private Message message;

    public Base64Message(final Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64
                .getEncoder()
                .encodeToString(this.message.getContent().getBytes());
    }
}
