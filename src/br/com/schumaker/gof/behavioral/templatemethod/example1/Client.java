package br.com.schumaker.gof.behavioral.templatemethod.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/10/2014
 */
public class Client {

    public static void main(String[] args) {
        Game jogo = new Jogo1();
        jogo.start();
    }
}
