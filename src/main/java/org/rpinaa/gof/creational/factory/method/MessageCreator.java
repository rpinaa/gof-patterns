package org.rpinaa.gof.creational.factory.method;

public abstract class MessageCreator {

    public Message getMessage() {

        final Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    public abstract Message createMessage();
}
