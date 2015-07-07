package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author hudson schumaker
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Eu ñ posso voar.");
    }
    
}
