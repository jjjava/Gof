package br.com.schumaker.gof.behavioral.interpreter.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class ExpressaoMilhar extends Expressao {

    @Override
    protected String nove() {
        return " ";
    }

    @Override
    protected String cinco() {
        return " ";
    }

    @Override
    protected String quatro() {
        return " ";
    }

    @Override
    protected String um() {
        return "M";
    }

    @Override
    protected int multiplo() {
        return 1000;
    }
}
