package org.rpinaa.gof.creational.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.rpinaa.gof.creational.factory.method.Client;
import org.rpinaa.gof.creational.factory.method.JSONMessageCreator;
import org.rpinaa.gof.creational.factory.method.Message;
import org.rpinaa.gof.creational.factory.method.TextMessageCreator;

@RunWith(JUnit4.class)
public class FactoryClientMethodTest {

    @Test
    public void printMessage_whenPassAJSONMessageCreatorInstance_shouldReturnASpecificJSONMessage() {

        final Message message = Client.printMessage(new JSONMessageCreator());

        Assert.assertNotNull(message);
        Assert.assertEquals(message.getContent(), "{\"JSON]\":[]}");
    }

    @Test
    public void printMessage_whenPassATextMessageCreatorInstance_shouldReturnASpecificTextMessage() {

        final Message message = Client.printMessage(new TextMessageCreator());

        Assert.assertNotNull(message);
        Assert.assertEquals(message.getContent(), "Only Text");
    }
}
