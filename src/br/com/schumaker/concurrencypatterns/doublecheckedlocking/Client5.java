package br.com.schumaker.concurrencypatterns.doublecheckedlocking;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client5 {

    private static class SimpleClassHolder {

        public static SimpleClass simpleClass = new SimpleClass();
    }

    public static SimpleClass getSimpleClass() {

        return SimpleClassHolder.simpleClass;
    }

    public static void main(String[] args) {
        Client5.getSimpleClass();
    }
}
