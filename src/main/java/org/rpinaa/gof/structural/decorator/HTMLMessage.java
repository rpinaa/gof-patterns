package org.rpinaa.gof.structural.decorator;

public class HTMLMessage implements Message {

    private Message message;

    public HTMLMessage(final Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return "<head> " + message.getContent() + " </head>";
    }
}
