package org.rpinaa.gof.behavioral.observer;

public class OctalObserver extends Observer{

    public OctalObserver(final Subject subject){
        this.subject = subject;

        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
