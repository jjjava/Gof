package br.com.schumaker.gof.behavioral.interpreter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hudson Schuamker
 */
public class Client {

    public static void main(String[] args) {
        String romano = "MCMXXVIII";

        Contexto contexto = new Contexto();
        contexto.setInput(romano);

        List<Expressao> tree = new ArrayList<Expressao>();
        tree.add(new ExpressaoMilhar());
        tree.add(new ExpressaoCentena());
        tree.add(new ExpressaoDezena());
        tree.add(new ExpressaoUm());

        for (Expressao exp : tree) {
            exp.interpretador(contexto);
        }

        String resultado = String.valueOf(contexto.getOutput());
        System.out.println(resultado);
    }
}
