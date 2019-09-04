package org.rpinaa.gof.behavioral.observer;

public class ObserverTest {

    public static void main(final String ... args) {

        final Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
