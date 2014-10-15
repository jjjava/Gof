package br.com.schumaker.gof.behavioral.mediator.example1;

/**
 *
 * @author Hudson Schumaker
 * updated
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
