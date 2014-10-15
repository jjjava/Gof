package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Catupiry extends PizzaDecorator {

    public Catupiry(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Captupiry";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 1.00;
    }
}
