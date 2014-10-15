package br.com.schumaker.gof.behavioral.chainofresponsibility.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class PowNumbers implements Chain {

    private Chain nextInChain;

    public PowNumbers() {
    }

    @Override
    public void setNextChain(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (!numbers.getCalculatioWantend().equalsIgnoreCase("pow")) {
            System.out.println("Only works for: add, sub, mult, div and pow");
        } else {
            System.out.println(numbers.getN1() + " ^ " + numbers.getN2() + " = " + (Math.pow(numbers.getN1() , numbers.getN2())));
        }
    }
}
