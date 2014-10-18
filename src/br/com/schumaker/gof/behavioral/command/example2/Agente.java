package br.com.schumaker.gof.behavioral.command.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/10/2014
 */
public class Agente {

    private List<OrdemCommand> ordens = new ArrayList<OrdemCommand>();

    public void add(OrdemCommand ordem) {
        this.ordens.add(ordem);
    }

    public void executa() {
        for (OrdemCommand ordem : this.ordens) {
            ordem.execute();
        }
    }
}
