package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 06/07/2015
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("estou voando!!!");
    }
    
}
