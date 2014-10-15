package br.com.schumaker.gof.creational.singleton.eager;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class EagerSingleton2 {

    private static class EagerSingleton2Holder {

        private static final EagerSingleton2 INSTANCE = new EagerSingleton2();
    }

    private EagerSingleton2() {
    }

    public static EagerSingleton2 getInstance() {
        return EagerSingleton2Holder.INSTANCE;
    }
}
