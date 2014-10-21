package br.com.schumaker.gof.behavioral.interpreter.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class ExpressaoDezena extends Expressao {

    @Override
    protected String nove() {
        return "XC";
    }

    @Override
    protected String cinco() {
        return "L";
    }

    @Override
    protected String quatro() {
        return "XL";
    }

    @Override
    protected String um() {
        return "X";
    }

    @Override
    protected int multiplo() {
        return 10;
    }
}
