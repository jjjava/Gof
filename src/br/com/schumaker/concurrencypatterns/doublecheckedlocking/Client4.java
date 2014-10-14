package br.com.schumaker.concurrencypatterns.doublecheckedlocking;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client4 {

    private volatile SimpleClass simpleClass = null;

    public SimpleClass getSimpleClass() {
        SimpleClass result = simpleClass;
        if (result == null) {
            synchronized (this) {
                result = simpleClass;
                if (result == null) {
                    result = simpleClass = new SimpleClass();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Client4 c = new Client4();
        c.getSimpleClass();
    }
}
