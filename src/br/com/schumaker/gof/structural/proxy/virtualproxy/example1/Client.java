/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.gof.structural.proxy.virtualproxy.example1;

/**
 *
 * @author Hudson
 */
public class Client {

    public static void main(String args[]) {
        // first time ask 25!, calculation required
        System.out.println(new ProxyFactorial(25).getResult());
        // first time ask 10!, calculation required
        System.out.println(new ProxyFactorial(10).getResult());
        System.out.println(new ProxyFactorial(999999999).getResult());
        System.out.println(new ProxyFactorial(999999998).getResult());
        System.out.println(new ProxyFactorial(999999997).getResult());
        // second time, do not need to calculate
        System.out.println(new ProxyFactorial(10).getResult());
        System.out.println(new ProxyFactorial(25).getResult());
        System.out.println(new ProxyFactorial(999999999).getResult());
        System.out.println(new ProxyFactorial(999999998).getResult());
        System.out.println(new ProxyFactorial(999999997).getResult());
    }
}
