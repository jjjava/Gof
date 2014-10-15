package br.com.schumaker.gof.creational.abstractfactory.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
abstract class WidgetFactory {

    public static WidgetFactory obterFactory() {

        if (Configuration.getGfxInterface() == Configuration.MotifWidget) {
            return new MotifWidgetFactory();
        } else {
            return new QtWidgetFactory();
        }
    }

    public abstract Button createButton();
}
