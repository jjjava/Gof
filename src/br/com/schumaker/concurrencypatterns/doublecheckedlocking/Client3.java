package br.com.schumaker.concurrencypatterns.doublecheckedlocking;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client3 {

    private SimpleClass simpleClass = null;

    public SimpleClass getSimpleClass() {
        if (simpleClass == null) {
            synchronized (this) {
                simpleClass = new SimpleClass();
            }
        }
        return simpleClass;
    }

    public static void main(String[] args) {
        Client3 c = new Client3();
        c.getSimpleClass();
    }
}
