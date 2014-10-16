package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class PedidoFacade {

    private Estoque estoque;
    private Financeiro financeiro;
    private Fiscal fiscal;

    public PedidoFacade(Estoque estoque, Financeiro financeiro, Fiscal fiscal) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.fiscal = fiscal;
    }

    public void efetivarPedido(Pedido pedido) {
        this.estoque.reserverProdutos(pedido);
        this.financeiro.recebido(pedido);
        this.fiscal.calcularImpostos(pedido);
    }

    public void cancelarPedido(Pedido pedido) {
        this.estoque.liberarEstoque(pedido);
        this.financeiro.devolverValores(pedido);
        this.fiscal.pedidoCancelado(pedido);
    }
}
