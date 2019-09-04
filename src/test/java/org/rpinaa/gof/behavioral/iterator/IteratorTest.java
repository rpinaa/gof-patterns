package org.rpinaa.gof.behavioral.iterator;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void getIterator_afterHasNextMethodInvoked_shouldReturnTheCurrentObjectInTheCollection() {

        final NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){

            String name = (String)iter.next();

            Assert.assertNotNull(name);

            System.out.println("Name : " + name);
        }
    }
}
