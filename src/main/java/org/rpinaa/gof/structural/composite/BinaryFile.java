package org.rpinaa.gof.structural.composite;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(final String name, final long size) {
        super(name);

        this.size = size;
    }

    @Override
    void ls() {
        System.out.println(getName() + "\t" + "size " + this.size);
    }

    @Override
    void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn´t support add operation");
    }

    @Override
    File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn´t support add operation");
    }

    @Override
    boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn´t support add operation");
    }
}
