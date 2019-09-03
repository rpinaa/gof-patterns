package org.rpinaa.gof.structural.proxy;

import javafx.geometry.Point2D;
import org.junit.Assert;
import org.junit.Test;

public class ImageProxyTest {

    @Test
    public void getImage_whenGetImageMethodHasInvoked_shouldReturnANotNullImageInstance() {

        final Image image = ImageFactory.getImage("A1.bmp");

        Assert.assertNotNull(image);

        image.setLocation(new Point2D(10,10));

        Assert.assertNotNull(image.getLocation());

        image.render();
    }
}
