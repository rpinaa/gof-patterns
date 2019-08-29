package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Instance;
import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class EC2Instance implements Instance {


    public EC2Instance(Capacity capacity) {
        System.out.println("Created Ec2Instance");
    }

    public void start() {
        System.out.println("Ec2Instance started");
    }

    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
