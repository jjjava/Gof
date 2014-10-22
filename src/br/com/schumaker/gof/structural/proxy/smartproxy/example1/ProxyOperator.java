package br.com.schumaker.gof.structural.proxy.smartproxy.example1;

import java.util.Objects;

/**
 *
 * @author Hudson Schumaker
 */
public class ProxyOperator implements Operator {

    private static Operator op = new RealOperator();
    private static final Integer MAX_CONCURRENT_OP = 10;
    private static Integer count = 0;

    @Override
    public void doOperation() {
        synchronized (MAX_CONCURRENT_OP) {
            if (Objects.equals(count, MAX_CONCURRENT_OP)) {
                System.out.println("At most " + MAX_CONCURRENT_OP + " operator(s) at a time, please wait.");
                try {
                    MAX_CONCURRENT_OP.wait();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
            count++;
        }
        op.doOperation();
        synchronized (MAX_CONCURRENT_OP) {
            MAX_CONCURRENT_OP.notify();
            count--;
        }
    }
}
