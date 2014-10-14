package br.com.schumaker.gof.behavioral.mediator;

/**
 *
 * @author Hudson Schumaker
 */
public class Consumer extends Thread {

    private Mediator med;
    private int id;
    private static int num = 1;

    public Consumer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("c" + id + "-" + med.retrieveMessage() + "  ");
        }
    }
}
