package br.com.schumaker.gof.behavioral.command.example2;

/**
 *
 * @author Hudson Schumaker
 */
public class OrdemCompra implements OrdemCommand {

    private NegociarAcao negociar;

    public OrdemCompra(NegociarAcao negociar) {
        this.negociar = negociar;
    }

    @Override
    public void execute() {
        this.negociar.compra();
    }
}