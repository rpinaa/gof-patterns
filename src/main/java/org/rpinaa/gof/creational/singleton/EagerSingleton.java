package org.rpinaa.gof.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public String getValue() {
        return "Eager Singleton";
    }
}
