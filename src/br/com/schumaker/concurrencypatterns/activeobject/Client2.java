package br.com.schumaker.concurrencypatterns.activeobject;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client2 {

    public static void main(String[] args) {
        BecomeActiveObject activeObject = new BecomeActiveObject();
        activeObject.start();
        for (int k = 0; k < 1000000; k++) {
            activeObject.doSomething();
        }
        
        for (int k = 0; k < 1000000; k++) {
            activeObject.doSomethingElse();
        }
    }
}
