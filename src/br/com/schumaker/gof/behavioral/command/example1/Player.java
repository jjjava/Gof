package br.com.schumaker.gof.behavioral.command.example1;

/**
 * Singleton Eager
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 14/09/2014
 *
 */
public class Player {

    private static final Player INSTANCE = new Player();

    private Player() {
    }

    public static Player getInstance() {
        return INSTANCE;
    }

    public void play(String fileName) {
        System.out.println("Playing file: " + fileName);
        long duration = (long) (Math.random() * 4000);
        System.out.println("Duration: " + duration / 1000.0);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
        }
        System.out.println("End");
    }

    public void increaseVolume(int level) {
        System.out.println("Increase volume");
    }

    public void decreaseVolume(int level) {
        System.out.println("Decrease volume");
    }
}
