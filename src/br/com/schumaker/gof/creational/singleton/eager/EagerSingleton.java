package br.com.schumaker.gof.creational.singleton.eager;

/**
 * @author Hudson Schumaker 
 * @version 1.0.0
 * @since 10/09/2014
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
