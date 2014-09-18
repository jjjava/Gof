package br.com.schumaker.concurrencypatterns.activeobject;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client {

    public static void main(String[] args) {
        BecomeActiveObject object = new BecomeActiveObject();
        

        for (int k = 0; k < 100; k++) {
            object.doSomething();
        }
        
        for (int k = 0; k < 100; k++) {
            object.doSomethingElse();
        }
        
        object.start();

        
    }
}
