package org.rpinaa.gof.structural.bridge;

public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> linkedList;

    public Queue(final LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T element) {
        this.linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return this.linkedList.removeFirst();
    }
}
