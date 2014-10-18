package br.com.schumaker.gof.behavioral.command.example2;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/10/2014
 */
public class Client {

    public static void main(String args[]) {
        NegociarAcao negociar = new NegociarAcao();
        //criar as ordens de compra e venda
        OrdemCommand ordemCompra = new OrdemCompra(negociar);
        OrdemCommand ordemVenda = new OrdemVenda(negociar);

        //adicioná-las ao agente
        Agente agente = new Agente();
        agente.add(ordemCompra);
        agente.add(ordemVenda);

        //Quando as ações puderem ser executadas
        agente.executa();
    }
}
