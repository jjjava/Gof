package br.com.schumaker.gof.structural.flyweight.example2;

/**
 *
 * @author hudson.sales
 */
class Order {

    private final int tableNumber;
    private final CoffeFlavour flavour;

    Order(int tableNumber, CoffeFlavour flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
