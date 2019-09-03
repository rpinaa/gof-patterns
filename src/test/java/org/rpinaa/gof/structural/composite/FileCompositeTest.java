package org.rpinaa.gof.structural.composite;

import org.junit.Test;

public class FileCompositeTest {

    @Test
    public void ls_afterLsMethod_shouldLogSomeLefAndChildrenObjectsFromTheComposite() {

        final File firstFile = new BinaryFile("File1", 1000);
        final Directory firstDirectory = new Directory("Dir1");

        firstDirectory.addFile(firstFile);

        final File secondFile = new BinaryFile("File2", 100);
        final File thirdFile = new BinaryFile("File3", 5000);
        final Directory secondDirectory = new Directory("Dir2");

        secondDirectory.addFile(secondFile);
        secondDirectory.addFile(thirdFile);
        secondDirectory.addFile(firstDirectory);

        secondDirectory.ls();
    }
}
