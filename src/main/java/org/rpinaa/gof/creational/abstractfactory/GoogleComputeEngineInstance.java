package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Instance;
import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created GoogleComputeEngineInstance");
    }

    public void start() {
        System.out.println("ComputeInstance started");
    }

    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to ComputeInstance");
    }

    public void stop() {
        System.out.println("ComputeInstance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
