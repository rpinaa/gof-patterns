package org.rpinaa.gof.creational.abstractfactory;

import org.rpinaa.gof.creational.abstractfactory.factory.Storage;

public class S3Storage implements Storage {

    public S3Storage(final int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " to S3");
    }

    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
