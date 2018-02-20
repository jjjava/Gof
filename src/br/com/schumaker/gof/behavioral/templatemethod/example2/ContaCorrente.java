
package br.com.schumaker.gof.behavioral.templatemethod.example2;

/**
 *
 * @author hudson.schumaker
 */
public class ContaCorrente extends Conta{

    @Override
    public double calculaTaxa() {
        return 3;
    }
}
