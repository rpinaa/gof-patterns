package org.rpinaa.gof.structural.bridge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FifoBridgeTest {

    @Test
    public void offer_afterAddThreeElementsAndPollFourOfThem_shouldBeNullTheLastPolledElement() {

        final FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer(10);
        collection.offer(40);
        collection.offer(90);

        collection.poll();
        collection.poll();
        collection.poll();

        final Integer lastElement = collection.poll();

        Assert.assertNull(lastElement);
    }
}
