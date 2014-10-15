package br.com.schumaker.gof.behavioral.visitor.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public interface Upgradeable {

    void accept(UpdateEmployee updateEmployee);
}
