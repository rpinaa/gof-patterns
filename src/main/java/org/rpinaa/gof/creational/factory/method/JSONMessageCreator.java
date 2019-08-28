package org.rpinaa.gof.creational.factory.method;

public class JSONMessageCreator extends MessageCreator {

    public Message createMessage() {
        return new JSONMessage();
    }
}
