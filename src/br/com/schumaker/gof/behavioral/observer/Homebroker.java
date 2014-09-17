package br.com.schumaker.gof.behavioral.observer;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class Homebroker implements ShareObserver {

    private String name;

    public Homebroker(String name) {
        this.name = name;
    }

    @Override
    public void notifyChange(Share share) {
        System.out.println(name + " notified.");
        System.out.println(share.getCode() + " $" + share.getPrice());
    }
}
