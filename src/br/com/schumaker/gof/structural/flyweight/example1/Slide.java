package br.com.schumaker.gof.structural.flyweight.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Slide {

    private final String title;
    private final String text;
    private final Theme theme;

    public Slide(String title, String text, Theme theme) {
        this.title = title;
        this.text = text;
        this.theme = theme;
    }

    public void print() {
        this.theme.show(title, text);
    }
}
