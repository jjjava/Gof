package br.com.schumaker.nogof.creational.multion.example2;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Camera.getInstance(001).getLocation());
        System.out.println(Camera.getInstance(002).getLocation());
    }
}
