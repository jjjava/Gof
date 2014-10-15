package br.com.schumaker.gof.behavioral.observer.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class Client {

    public static void main(String[] args) {
        Share[] stockExchange = new Share[4];
        stockExchange[0] = new Share("OLX", 4.00);
        stockExchange[1] = new Share("OCX", 4.00);
        stockExchange[2] = new Share("OGX", 4.00);
        stockExchange[3] = new Share("CCX", 4.00);

        Brokerage brokerage = new Brokerage("XpInvestimentos");
        Homebroker homebroker = new Homebroker("H.Schumaker");

        for (int k = 0; k < stockExchange.length; k++) {
            stockExchange[k].attach(homebroker);
            stockExchange[k].attach(brokerage);
        }

        for (int k = 0; k < stockExchange.length; k++) {
            stockExchange[k].setPrice(k + 3.0);
        }
    }
}
