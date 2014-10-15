package br.com.schumaker.gof.creational.decorator.example1;

import java.awt.Toolkit;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 15/10/2014
 */
public class Beep implements Siren {

    private Siren wrapped;

    public Beep(Siren wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void alarm() {
        wrapped.alarm();
        Toolkit.getDefaultToolkit().beep();
    }
}