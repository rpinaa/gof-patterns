package org.rpinaa.gof.creational.factory.method;

public class TextMessageCreator extends MessageCreator {

    public Message createMessage() {
        return new TextMessage();
    }
}
