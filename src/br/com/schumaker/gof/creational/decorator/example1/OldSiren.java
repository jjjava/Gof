package br.com.schumaker.gof.creational.decorator.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 15/10/2014
 */
public class OldSiren implements Siren {

    @Override
    public void alarm() {
        System.err.println("Something goes wrong!!!");
    }
}
