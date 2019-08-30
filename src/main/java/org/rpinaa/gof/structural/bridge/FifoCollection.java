package org.rpinaa.gof.structural.bridge;

public interface FifoCollection<T> {

    void offer(T element);

    T poll();
}
