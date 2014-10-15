package br.com.schumaker.gof.behavioral.mediator.example2;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Usuario {

    private Mediator mediator;

    public Usuario(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}