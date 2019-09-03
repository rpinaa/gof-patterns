package org.rpinaa.gof.behavioral.mediator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MediatorTest {

    private Button button;
    private Fan fan;

    @Before
    public void setUp() {

        Mediator mediator = new Mediator();

        this.fan = new Fan(mediator);
        this.button = new Button(mediator);
        final PowerSupplier powerSupplier = new PowerSupplier();

        mediator.setButton(this.button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
    }

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assertFalse(fan.isOn());

        button.press();
        assertTrue(fan.isOn());

        button.press();
        assertFalse(fan.isOn());
    }
}
