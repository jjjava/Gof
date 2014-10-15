package br.com.schumaker.gof.structural.flyweight.example1;

import java.util.Arrays;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class ThemeAsterisk implements Theme {

    @Override
    public void show(String title, String text) {
        System.out.println("********** " + title + " **********");
        System.out.println(text);
        char[] footer = new char[22 + title.length()];
        Arrays.fill(footer, '*');
        System.out.println(footer);
    }
}
