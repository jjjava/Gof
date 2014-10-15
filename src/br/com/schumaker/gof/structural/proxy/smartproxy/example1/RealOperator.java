package br.com.schumaker.gof.structural.proxy.smartproxy.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class RealOperator implements Operator {

    public RealOperator() {
    }

    @Override
    public void doOperation() {
        System.out.println("Do operation...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("Done.");
    }
}
