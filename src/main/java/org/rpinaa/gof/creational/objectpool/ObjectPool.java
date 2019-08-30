package org.rpinaa.gof.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(final Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingDeque<>();

        for (int i = 0; i < count; i++) {
            this.availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return this.availablePool.take();
        } catch (InterruptedException e) {
            System.out.println("take() was interrupted");
        }

        return null;
    }

    public void release(T object) {

        object.reset();

        try {
            this.availablePool.put(object);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
        }
    }
}
