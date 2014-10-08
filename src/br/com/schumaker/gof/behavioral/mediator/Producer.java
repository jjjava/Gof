/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.gof.behavioral.mediator;

/**
 *
 * @author hudson.sales
 */
public class Producer extends Thread {

    private Mediator med;
    private int id;
    private static int num = 1;

    public Producer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        int n;
        while (true) {
            med.storeMessage(n = (int) (Math.random() * 100));
            System.out.println("p" + id + "-" + n+ "  ");
        }
    }
}
