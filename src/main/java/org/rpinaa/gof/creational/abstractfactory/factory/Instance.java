package org.rpinaa.gof.creational.abstractfactory.factory;

public interface Instance {

    enum Capacity {MICRO, SMALL, LARGE};

    void start();

    void attachStorage(Storage storage);

    void stop();
}
