package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Cebola extends PizzaDecorator {

    public Cebola(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Cebola";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 0.50;
    }
}
