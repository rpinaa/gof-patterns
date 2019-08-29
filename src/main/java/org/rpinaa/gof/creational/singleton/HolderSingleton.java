package org.rpinaa.gof.creational.singleton;

public class HolderSingleton {

    private HolderSingleton() {}

    private static class Holder {
        static HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
