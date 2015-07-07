package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author hudson schumaker
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Eu sou um Model pato");
    }

}
