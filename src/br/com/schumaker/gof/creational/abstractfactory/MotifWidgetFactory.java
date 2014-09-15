package br.com.schumaker.gof.creational.abstractfactory;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 16/09/2014
 */
class MotifWidgetFactory extends WidgetFactory {

    @Override
    public Button createButton() {
        return new ButtonMotif();
    }
}
