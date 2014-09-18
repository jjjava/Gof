package br.com.schumaker.concurrencypatterns.doublecheckedlocking;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client2 {

    private SimpleClass simpleClass = null;

    public synchronized SimpleClass getSimpleClass() {
        if (simpleClass == null) {
            simpleClass = new SimpleClass();
        }
        return simpleClass;
    }

    public static void main(String[] args) {
        Client2 c = new Client2();
        c.getSimpleClass();
    }
}
