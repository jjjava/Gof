package br.com.schumaker.gof.behavioral.chainofresponsibility.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class AddNumbers implements Chain {

    private Chain nextInChain;

    public AddNumbers() {
    }

    @Override
    public void setNextChain(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (!numbers.getCalculatioWantend().equalsIgnoreCase("add")) {
            nextInChain.calculate(numbers);
        } else {
            System.out.println(numbers.getN1() + " + " + numbers.getN2() + " = " + (numbers.getN1() + numbers.getN2()));
        }
    }
}
