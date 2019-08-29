package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Instance;
import org.rpinaa.gof.creational.abstractfactory.factory.ResourceFactory;
import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
