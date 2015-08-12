package br.com.schumaker.gof.behavioral.mediator.example3;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Passageiro implements Runnable {

    private String nome;
    private CentralUber central;

    public Passageiro(String nome, CentralUber central) {
        this.nome = nome;
        this.central = central;
    }

    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            this.central.solicitaBlackCar(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}