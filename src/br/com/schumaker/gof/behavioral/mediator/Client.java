package br.com.schumaker.gof.behavioral.mediator;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Mediator mb = new Mediator();
        new Producer(mb).start();
        new Producer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
    }
}
