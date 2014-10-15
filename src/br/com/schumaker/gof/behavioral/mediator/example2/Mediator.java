package br.com.schumaker.gof.behavioral.mediator.example2;

/**
 *
 * @author Hudson Schumaker
 */
public interface Mediator {

    public void send(String message, Usuario from);
}