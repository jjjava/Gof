package br.com.schumaker.nogof.behavioral.nullobject.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();

        Animal unknown = new NullAnimal();
        unknown.makeSound();

        unknown = dog;
        unknown.makeSound();
    }
}
