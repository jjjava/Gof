package br.com.schumaker.gof.behavioral.interpreter.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class ExpressaoCentena extends Expressao {

    @Override
    protected String nove() {
        return "CM";
    }

    @Override
    protected String cinco() {
        return "D";
    }

    @Override
    protected String quatro() {
        return "CD";
    }

    @Override
    protected String um() {
        return "C";
    }

    @Override
    protected int multiplo() {
        return 100;
    }
}
