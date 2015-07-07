package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author hudson schumaker
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("estou voando!!!");
    }
    
}
