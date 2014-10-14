package br.com.schumaker.gof.creational.singleton;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Static block: ", e);
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
