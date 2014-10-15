package br.com.schumaker.gof.structural.flyweight.example2;

/**
 *
 * @author hudson.sales
 */
// Instances of CoffeeFlavour will be the Flyweights
class CoffeFlavour {

    private final String name;

    CoffeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
