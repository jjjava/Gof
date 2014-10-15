package br.com.schumaker.gof.creational.singleton.lazy;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 10/09/2014
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
