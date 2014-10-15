package br.com.schumaker.gof.behavioral.chainofresponsibility;

/**
 *
 * @author Hudson Schumaker
 */
public class MultNumbers implements Chain {

    private Chain nextInChain;

    public MultNumbers() {
    }

    @Override
    public void setNextChain(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (!numbers.getCalculatioWantend().equalsIgnoreCase("mult")) {
            nextInChain.calculate(numbers);
        } else {
            System.out.println(numbers.getN1() + " * " + numbers.getN2() + " = " + (numbers.getN1() * numbers.getN2()));
        }
    }
}
