package org.rpinaa.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    void ls() {
        System.out.println(getName());

        children.forEach(File::ls);
    }

    @Override
    void addFile(File file) {
        children.add(file);
    }

    @Override
    File[] getFiles() {
        return children.toArray(new File[0]);
    }

    @Override
    boolean removeFile(File file) {
        return children.remove(file);
    }
}
