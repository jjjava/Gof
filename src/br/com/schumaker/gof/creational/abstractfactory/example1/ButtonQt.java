package br.com.schumaker.gof.creational.abstractfactory.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
class ButtonQt extends Button {

    @Override
    public void draw() {
        System.out.println("I'm a Qt button!");
    }
}
