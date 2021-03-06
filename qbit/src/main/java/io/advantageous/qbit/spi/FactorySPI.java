package io.advantageous.qbit.spi;

import io.advantageous.qbit.Factory;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Richard on 9/26/14.
 * @author rhightower
 */
public class FactorySPI {

    private static final AtomicReference<Factory> ref = new AtomicReference<>();


    public static Factory getFactory() {
        return ref.get();
    }


    public static void setFactory(Factory factory) {
        ref.set(factory);
    }
}
