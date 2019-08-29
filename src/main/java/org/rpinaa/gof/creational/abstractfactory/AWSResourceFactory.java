package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Instance;
import org.rpinaa.gof.creational.abstractfactory.factory.ResourceFactory;
import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class AWSResourceFactory implements ResourceFactory {

    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
