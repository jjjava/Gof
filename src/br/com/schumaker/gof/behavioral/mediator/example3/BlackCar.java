package br.com.schumaker.gof.behavioral.mediator.example3;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class BlackCar {

    private CentralUber central;
    private int id;
    private static int k = 1;

    public BlackCar(CentralUber central) {
        this.central = central;
        this.id = BlackCar.k++;
    }

    public void atende() {
        try {
            Thread.sleep((long) (Math.random() * 7000));
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        this.central.adicionaBlackCarDisponivel(this);
    }

    public int getId() {
        return id;
    }
}
