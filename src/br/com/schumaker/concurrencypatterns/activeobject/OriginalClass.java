package br.com.schumaker.concurrencypatterns.activeobject;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class OriginalClass {

    private double val = 0.0;

    void doSomething() {
        val = 1.0;
        System.out.println("Value: " + val);
    }

    void doSomethingElse() {
        val = 2.0;
        System.out.println("Value: " + val);
    }
}
