package br.com.schumaker.gof.creational.decorator.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 15/10/2014
 */
public class Client {

    public static void main(String args[]) throws InterruptedException {
        // alarm by an OldSiren
        new OldSiren().alarm();
        Thread.sleep(3000);
        // alarm by an OldSiren that wrapped by a BeepDecorator
        new Beep(new OldSiren()).alarm();
    }
}
