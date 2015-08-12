package br.com.schumaker.gof.behavioral.mediator.example3;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Cliente {
    public static void main(String args[]){
        CentralUber centralUber = new CentralUber();
        
        Passageiro p1 = new Passageiro("Hudson Schumaker", centralUber);
        Passageiro p2 = new Passageiro("Hugo Schumaker", centralUber);
        Passageiro p3 = new Passageiro("Humberto Schumaker", centralUber);
        Passageiro p4 = new Passageiro("Gabriel Schumaker", centralUber);
        Passageiro p5 = new Passageiro("Nikolas Schumaker", centralUber);
        Passageiro p6 = new Passageiro("Saulo Schumaker", centralUber);
        Passageiro p7 = new Passageiro("Elizabeth Schumaker", centralUber);
        
        BlackCar b1 = new BlackCar(centralUber);
        centralUber.adicionaBlackCarDisponivel(b1);
        
        BlackCar b2 = new BlackCar(centralUber);
        centralUber.adicionaBlackCarDisponivel(b2);
        
        BlackCar b3 = new BlackCar(centralUber);
        centralUber.adicionaBlackCarDisponivel(b3);
        
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();
        new Thread(p6).start();
        new Thread(p7).start();
        
    }
}
