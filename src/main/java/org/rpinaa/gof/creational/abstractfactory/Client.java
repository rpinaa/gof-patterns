package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Instance;
import org.rpinaa.gof.creational.abstractfactory.factory.ResourceFactory;
import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(final ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(final Instance.Capacity capacity, int storageInMib) {

        final Instance instance = resourceFactory.createInstance(capacity);
        final Storage storage = resourceFactory.createStorage(storageInMib);

        instance.attachStorage(storage);

        return instance;
    }
}
