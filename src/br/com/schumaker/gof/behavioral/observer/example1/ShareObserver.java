package br.com.schumaker.gof.behavioral.observer.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public interface ShareObserver {

    void notifyChange(Share share);
}
