package br.com.schumaker.gof.behavioral.templatemethod.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/10/2014
 */
public abstract class Game {

    protected boolean active = false;

    private void run() {
        active = true;
        load();
        while (active) {
            update();
            print();
        }
        onload();
    }

    public void start() {
        run();
    }

    protected abstract void load();
    protected abstract void update();
    protected abstract void print();
    protected abstract void onload();
}
