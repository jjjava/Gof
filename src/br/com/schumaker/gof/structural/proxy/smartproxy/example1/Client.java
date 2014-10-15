package br.com.schumaker.gof.structural.proxy.smartproxy.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String args[]) {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    new ProxyOperator().doOperation();
                }
            }).start();
        }
    }
}
