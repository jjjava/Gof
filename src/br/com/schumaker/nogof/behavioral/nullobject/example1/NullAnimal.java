package br.com.schumaker.nogof.behavioral.nullobject.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class NullAnimal implements Animal {

    @Override
    public void makeSound() {
        System.out.println("???");
    }
}
