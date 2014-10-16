package br.com.schumaker.gof.structural.proxy.virtualproxy.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Fornecedor fornecedor = new FornecedorPadrao();
        // atribuição dos dados

        Fornecedor proxy = new ProxyFornecedor(fornecedor);
        proxy.save();
    }
}
