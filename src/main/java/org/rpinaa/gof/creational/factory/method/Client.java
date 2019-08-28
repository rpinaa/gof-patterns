package org.rpinaa.gof.creational.factory.method;

public class Client {

    private Client() {}

    public static Message printMessage(final MessageCreator messageCreator) {

        return messageCreator.getMessage();
    }
}
