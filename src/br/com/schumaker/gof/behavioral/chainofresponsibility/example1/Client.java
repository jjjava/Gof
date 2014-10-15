package br.com.schumaker.gof.behavioral.chainofresponsibility.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Chain start = new AddNumbers();
        Chain calc2 = new SubtractNumbers();
        Chain calc3 = new MultNumbers();
        Chain calc4 = new DivideNumbers();
        Chain end = new PowNumbers();

        start.setNextChain(calc2);
        calc2.setNextChain(calc3);
        calc3.setNextChain(calc4);
        calc4.setNextChain(end);

        Numbers numbers = new Numbers(2, 2, "sqrt");
        Numbers numbers2 = new Numbers(2, 2, "pow");
        Numbers numbers3 = new Numbers(2, 2, "div");

        start.calculate(numbers);
        start.calculate(numbers2);
        start.calculate(numbers3);


    }
}
