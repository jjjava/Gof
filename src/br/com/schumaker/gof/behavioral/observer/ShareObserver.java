package br.com.schumaker.gof.behavioral.observer;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public interface ShareObserver {

    void notifyChange(Share share);
}
