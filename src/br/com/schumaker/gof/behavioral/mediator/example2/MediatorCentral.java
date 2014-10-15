package br.com.schumaker.gof.behavioral.mediator.example2;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 */
public class MediatorCentral implements Mediator {

    private ArrayList<Usuario> usuarios;

    public MediatorCentral() {
        usuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void send(String message, Usuario from) {
        for (Usuario usuario : usuarios) {
            if (usuario != from) {
                usuario.receive(message);
            }
        }
    }
}