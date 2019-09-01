package org.rpinaa.gof.structural.proxy;

public class ImageFactory {

    public static ImageProxy getImage(String name) {
        return new ImageProxy(name);
    }
}
