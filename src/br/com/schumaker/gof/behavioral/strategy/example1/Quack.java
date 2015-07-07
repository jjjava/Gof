package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author hudson schumaker
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
