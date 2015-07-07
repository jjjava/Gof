package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 06/07/2015
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< mudo >>");
    }
    
}
