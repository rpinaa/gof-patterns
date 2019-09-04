package org.rpinaa.gof.behavioral.observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(final Subject subject){
        this.subject = subject;

        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
