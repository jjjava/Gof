package br.com.schumaker.gof.structural.flyweight.example1;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Presentation {

    private final ArrayList<Slide> slides;

    public Presentation() {
        this.slides = new ArrayList<>();
    }

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void print() {
        for (Slide slide : slides) {
            slide.print();
            System.out.println();
        }
    }
}
