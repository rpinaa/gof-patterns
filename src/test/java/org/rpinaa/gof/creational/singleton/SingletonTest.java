package org.rpinaa.gof.creational.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SingletonTest {

    @Test
    public void getInstance_whenGetInstanceMethodIsInvoked_shouldReturnAnAlreadyInstance() {

        final EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        Assert.assertNotNull(eagerSingleton);

        final EagerSingleton secondEagerSingleton = EagerSingleton.getInstance();

        Assert.assertEquals(eagerSingleton, secondEagerSingleton);
    }

    @Test
    public void getInstance_whenGetInstanceMethodFromLazySingletonIsInvoked_shouldReturnAnAlreadyInstance() {

        final LazySingleton lazySingleton = LazySingleton.getInstance();

        Assert.assertNotNull(lazySingleton);

        final LazySingleton secondLazySingleton = LazySingleton.getInstance();

        Assert.assertEquals(lazySingleton, secondLazySingleton);
    }

    @Test
    public void getInstance_whenGetInstanceMethodFromHolderSingletonIsInvoked_shouldReturnAnAlreadyInstance() {

        final HolderSingleton holderSingleton = HolderSingleton.getInstance();

        Assert.assertNotNull(holderSingleton);

        final HolderSingleton secondHolderSingleton = HolderSingleton.getInstance();

        Assert.assertEquals(holderSingleton, secondHolderSingleton);
    }
}
