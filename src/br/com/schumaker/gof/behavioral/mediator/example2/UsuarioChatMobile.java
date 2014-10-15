package br.com.schumaker.gof.behavioral.mediator.example2;

/**
 *
 * @author Hudson Schumaker
 */
public class UsuarioChatMobile extends Usuario {

    public UsuarioChatMobile(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("usuario chatMobile: " + message);
    }
}
