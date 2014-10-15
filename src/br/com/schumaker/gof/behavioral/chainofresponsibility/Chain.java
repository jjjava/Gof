package br.com.schumaker.gof.behavioral.chainofresponsibility;

/**
 *
 * @author Hudson Schumaker
 */
public interface Chain {

    public void setNextChain(Chain c);
    public void calculate(Numbers numbers);
    
}
