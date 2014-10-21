package br.com.schumaker.gof.behavioral.interpreter.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class ExpressaoUm extends Expressao {

    @Override
    protected String nove() {
        return "IX";
    }

    @Override
    protected String cinco() {
        return "V";
    }

    @Override
    protected String quatro() {
        return "IV";
    }

    @Override
    protected String um() {
        return "I";
    }

    @Override
    protected int multiplo() {
        return 1;
    }
}
