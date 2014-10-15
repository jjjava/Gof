package br.com.schumaker.gof.creational.singleton.lazy;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class LazySingleton3 {

    private volatile static LazySingleton3 instance = null;

    private LazySingleton3() {
    }

    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}
