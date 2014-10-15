package br.com.schumaker.gof.structural.flyweight.example1;

import java.util.Arrays;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class ThemeHudson implements Theme {

    @Override
    public void show(String title, String text) {
        System.out.println("##########" + title.toUpperCase() + "###########");
        System.out.println(text);
        char[] footerL = new char[(int) Math.floor((6 + title.length()) / 2.0)];
        char[] footerR = new char[(int) Math.ceil((6 + title.length()) / 2.0)];
        Arrays.fill(footerL, '#');
        Arrays.fill(footerR, '#');
        System.out.println(new String(footerL) + "200.98.143.1/hs" + new String(footerR));
    }
}
