package br.com.schumaker.gof.creational.singleton;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 10/09/2014
 */
public class LazySingleton2 {

    private static LazySingleton2 instance = null;

    private LazySingleton2() {
    }

    public static  LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized(getInstance()){
                instance = new LazySingleton2();
            }
        }
        return instance;
    }
}
