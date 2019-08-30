package org.rpinaa.gof.creational.objectpool;

public class ObjectPoolClient {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 10);
}
