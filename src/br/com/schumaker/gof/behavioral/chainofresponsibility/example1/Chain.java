package br.com.schumaker.gof.behavioral.chainofresponsibility.example1;

/**
 *
 * @author Hudson Schumaker
 */
public interface Chain {

    public void setNextChain(Chain c);
    public void calculate(Numbers numbers);
    
}
