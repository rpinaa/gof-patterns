package org.rpinaa.gof.structural.decorator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MessageDecoratorTest {

    @Test
    public void getContent_whenDecorateTheTextMessageByHTML_shouldReturnTheOriginalMessageWrappedByHeadHTMLTags() {

        final Message message = new TextMessage("This is just a proof");
        final Message decoratedMessage = new HTMLMessage(message);

        Assert.assertNotNull(decoratedMessage);
        Assert.assertEquals(decoratedMessage.getContent(), "<head> This is just a proof </head>");
    }

    @Test
    public void getContent_whenDecorateTheHTMLMessageByBase64_shouldReturnTheOriginalMessageHashedByBase64() {

        final Message message = new TextMessage("This is just a proof");
        final Message decoratedMessage = new HTMLMessage(message);
        final Message hashedMessage = new Base64Message(decoratedMessage);

        Assert.assertNotNull(hashedMessage);
        Assert.assertEquals(hashedMessage.getContent(), "PGhlYWQ+IFRoaXMgaXMganVzdCBhIHByb29mIDwvaGVhZD4=");
    }
}
