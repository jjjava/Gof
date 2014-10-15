package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class MolhoTomate extends PizzaDecorator {

    public MolhoTomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Molho de tomate";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 1.00;
    }
}
