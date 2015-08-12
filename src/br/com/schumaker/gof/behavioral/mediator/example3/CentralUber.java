package br.com.schumaker.gof.behavioral.mediator.example3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class CentralUber {

    private List<BlackCar> blackCarLivres = new ArrayList<>();
    private List<Passageiro> passageirosEmEspera = new ArrayList<>();

    public synchronized void adicionaBlackCarDisponivel(BlackCar blackCar) {
        System.out.println("BlackCar " + blackCar.getId() + " ancorado");
        blackCarLivres.add(blackCar);
        this.notifyAll();
    }

    public void solicitaBlackCar(Passageiro passageiro) {
        BlackCar blackCar = this.aguardaBlackCar(passageiro);
        System.out.println("BlackCar " + blackCar.getId() + " levando " + passageiro.getNome());
        blackCar.atende();
    }

    private synchronized BlackCar aguardaBlackCar(Passageiro passageiro) {
        this.passageirosEmEspera.add(passageiro);
        synchronized (this) {
            while (this.blackCarLivres.isEmpty()
                    || !this.passageirosEmEspera.get(0).equals(passageiro)) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }
        this.passageirosEmEspera.remove(0);
        return this.blackCarLivres.remove(0);
    }
}
