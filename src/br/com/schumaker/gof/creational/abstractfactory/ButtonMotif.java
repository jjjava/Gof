package br.com.schumaker.gof.creational.abstractfactory;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
class ButtonMotif extends Button {

    @Override
    public void draw() {
        System.out.println("I'm a Motif button!");
    }
}
