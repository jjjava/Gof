package br.com.schumaker.gof.creational.abstractfactory.example1;

import java.util.Random;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
public class Configuration {

    public static int MotifWidget = 1;

    public static int getGfxInterface() {
        Random rd = new Random();
        return rd.nextInt(2);
    }
}
