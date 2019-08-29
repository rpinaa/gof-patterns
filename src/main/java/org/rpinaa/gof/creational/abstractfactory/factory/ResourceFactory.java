package org.rpinaa.gof.creational.abstractfactory.factory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMib);
}
