package org.rpinaa.gof.behavioral.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void executeStrategy_afterExecuteStrategyPassingTenAndFiveAsArguments_shouldReturnTheRightValueForEachOperation() {

        Context context = new Context(new OperationAdd());

        Assert.assertEquals(context.executeStrategy(10, 5), 15);
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());

        Assert.assertEquals(context.executeStrategy(10, 5), 5);
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());

        Assert.assertEquals(context.executeStrategy(10, 5), 50);
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
