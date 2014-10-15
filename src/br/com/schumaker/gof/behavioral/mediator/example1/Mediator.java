package br.com.schumaker.gof.behavioral.mediator.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Mediator {

    private boolean slotFull = false;
    private int number;

    public synchronized void storeMessage(int num) {
        // no room for another message
        //espaço para mais uma mensagem
        while (slotFull == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    public synchronized int retrieveMessage() {
        // no message to retrieve
        while (slotFull == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        slotFull = false;
        notifyAll();
        return number;
    }
}
