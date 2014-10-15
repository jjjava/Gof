package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson
 */
public class PizzaMozzarella extends PizzaDecorator {

    public PizzaMozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Muzarella";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 2.00;
    }
}
