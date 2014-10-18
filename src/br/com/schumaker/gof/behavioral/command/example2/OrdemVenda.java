package br.com.schumaker.gof.behavioral.command.example2;

/**
 *
 * @author Hudson Schumaker
 * @since 18/10/2014
 */
public class OrdemVenda implements OrdemCommand {

    private NegociarAcao negociar;

    public OrdemVenda(NegociarAcao negociar) {
        this.negociar = negociar;
    }

    @Override
    public void execute() {
        this.negociar.venda();
    }
}