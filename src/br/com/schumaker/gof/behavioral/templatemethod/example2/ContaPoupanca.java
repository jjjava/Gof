
package br.com.schumaker.gof.behavioral.templatemethod.example2;

/**
 *
 * @author hudson.schumaker
 */
public class ContaPoupanca extends Conta{

    @Override
    public double calculaTaxa() {
        return 1;
    }
}
