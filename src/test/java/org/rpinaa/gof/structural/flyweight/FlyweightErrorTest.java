package org.rpinaa.gof.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.rpinaa.gof.structural.flyweight.ErrorMessageFactory.ErrorType.*;

@RunWith(JUnit4.class)
public class FlyweightErrorTest {

    @Test
    public void getError_whenAGenericSystemErrorHasPassed_shouldReturnANotNullSystemErrorMessage() {

        final SystemErrorMessage systemErrorMessage = ErrorMessageFactory.getInstance().getError(GENERIC_SYSTEM_ERROR);

        Assert.assertNotNull(systemErrorMessage);
        Assert.assertNotNull(systemErrorMessage.getText("4056"));
    }

    @Test
    public void getError_whenANotFoundSystemErrorHasPassed_shouldReturnANotNullSystemErrorMessage() {

        final SystemErrorMessage systemErrorMessage = ErrorMessageFactory.getInstance().getError(PAGE_NOT_FOUND_ERROR);

        Assert.assertNotNull(systemErrorMessage);
        Assert.assertNotNull(systemErrorMessage.getText("1111"));
    }

    @Test
    public void getError_whenAServerErrorHasPassed_shouldReturnANotNullSystemErrorMessage() {

        final SystemErrorMessage systemErrorMessage = ErrorMessageFactory.getInstance().getError(SERVER_ERROR);

        Assert.assertNotNull(systemErrorMessage);
        Assert.assertNotNull(systemErrorMessage.getText("1111"));
    }
}
