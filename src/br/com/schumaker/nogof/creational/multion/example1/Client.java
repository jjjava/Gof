package br.com.schumaker.nogof.creational.multion.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Client {

    public static void main(String[] args) {
        Theme themeFire = Theme.getInstance(Theme.SKY);
        System.out.println("Theme" + themeFire.getName());
        System.out.println("Font Color: " + themeFire.getFontColor());
        System.out.println("Bg Color: " + themeFire.getBackgroundColor());

        Theme themeFire2 = Theme.getInstance(Theme.FIRE);

        System.out.println("--------");
        System.out.println("Compare ...");
        System.out.println(themeFire == themeFire2);
    }
}
