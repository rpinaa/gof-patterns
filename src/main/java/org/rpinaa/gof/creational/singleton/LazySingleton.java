package org.rpinaa.gof.creational.singleton;

public class LazySingleton {

    private static volatile LazySingleton INSTANCE;

    private LazySingleton() { }

    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }

    public String getValue() {
        return "Eager Singleton";
    }
}
