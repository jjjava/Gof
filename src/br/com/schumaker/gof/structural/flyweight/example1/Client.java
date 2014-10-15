package br.com.schumaker.gof.structural.flyweight.example1;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Client {

    public static void main(String[] args) {
        Presentation p = new Presentation();
        p.addSlide(new Slide("Cidiz - 2014", "Cidiz - MMN", ThemeFactory.getTheme(ThemeFactory.ASTERISK)));
        p.addSlide(new Slide("Cidiz - 2014", "Cidiz - MMN", ThemeFactory.getTheme(ThemeFactory.HIFEN)));
        p.addSlide(new Slide("Cidiz - 2014", "Cidiz - MMN", ThemeFactory.getTheme(ThemeFactory.HUDSON)));

        p.print();
    }
}
