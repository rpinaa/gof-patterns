package org.rpinaa.gof.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;
import org.rpinaa.gof.creational.abstractfactory.factory.Instance;

public class AbstractFactoryClientTest {

    @Test
    public void createServer_whenAClientGetsAnAWSResourceFactoryInstance_shouldReturnANotNullClientAndInstance() {

        final Client client = new Client(new AWSResourceFactory());

        final Instance  instance = client.createServer(Instance.Capacity.MICRO, 2048);

        Assert.assertNotNull(client);
        Assert.assertNotNull(instance);

        instance.start();
        instance.stop();
    }

    @Test
    public void createServer_whenAClientGetsAnGoogleResourceFactoryInstance_shouldReturnANotNullClientAndInstance() {

        final Client client = new Client(new GoogleResourceFactory());

        final Instance  instance = client.createServer(Instance.Capacity.LARGE, 4096);

        Assert.assertNotNull(client);
        Assert.assertNotNull(instance);

        instance.start();
        instance.stop();
    }
}
