package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 06/07/2015
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Mallard");
    }

}
