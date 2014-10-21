package br.com.schumaker.gof.behavioral.interpreter.example1;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Expressao {

    public void interpretador(Contexto contexto) {
        if (contexto.getInput().length() == 0) {
            return;
        }

        if (contexto.getInput().startsWith(nove())) {
            contexto.setOutput(contexto.getOutput() + (9 * multiplo()));
            contexto.setInput(contexto.getInput().substring(2));
        } else if (contexto.getInput().startsWith(cinco())) {
            contexto.setOutput(contexto.getOutput() + (5 * multiplo()));
            contexto.setInput(contexto.getInput().substring(1));
        } else if (contexto.getInput().startsWith(quatro())) {
            contexto.setOutput(contexto.getOutput() + (4 * multiplo()));
            contexto.setInput(contexto.getInput().substring(2));
        }

        while (contexto.getInput().startsWith(um())) {
            contexto.setOutput(contexto.getOutput() + (1 * multiplo()));
            contexto.setInput(contexto.getInput().substring(1));
        }
    }

    protected abstract String nove();

    protected abstract String cinco();

    protected abstract String quatro();

    protected abstract String um();

    protected abstract int multiplo();
}
