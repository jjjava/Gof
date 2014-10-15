package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Azeitona extends PizzaDecorator {

    public Azeitona(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Azeitona";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 0.50;
    }
}
