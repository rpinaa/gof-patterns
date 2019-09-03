package org.rpinaa.gof.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Fan(final Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
