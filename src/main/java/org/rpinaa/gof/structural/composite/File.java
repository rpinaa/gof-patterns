package org.rpinaa.gof.structural.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class File {

    private String name;

    public File(final String name) {
        this.name = name;
    }

    abstract void ls();

    abstract void addFile(File file);

    abstract File[] getFiles();

    abstract boolean removeFile(File file);
}
