package br.com.schumaker.gof.creational.abstractfactory.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
public class Client {

    public static void main(String[] args) {
        WidgetFactory factory = WidgetFactory.obterFactory();

        Button button = factory.createButton();
        button.draw();
    }
}
