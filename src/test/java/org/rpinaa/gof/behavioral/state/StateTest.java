package org.rpinaa.gof.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void getState_afterStartAndStopCycle_ShouldTheContextReturnAStopState() {

        final Context context = new Context();
        final StartState startState = new StartState();

        startState.doAction(context);

        System.out.println(context.getState().toString());

        final StopState stopState = new StopState();

        stopState.doAction(context);

        System.out.println(context.getState().toString());

        Assert.assertEquals(context.getState().toString(), "Stop State");
    }
}
