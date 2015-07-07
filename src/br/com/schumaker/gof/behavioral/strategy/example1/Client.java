package br.com.schumaker.gof.behavioral.strategy.example1;

/**
 *
 * @author hudson schumaker
 */
public class Client {
    public static void main(String args []){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        
         Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();  
    }
}
