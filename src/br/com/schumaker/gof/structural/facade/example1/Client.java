package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNumero(1);

        Estoque estoque = new Estoque();
        Financeiro financeiro = new Financeiro();
        Fiscal fiscal = new Fiscal();

        PedidoFacade facade = new PedidoFacade(estoque, financeiro, fiscal);
        facade.efetivarPedido(pedido);
    }
}
