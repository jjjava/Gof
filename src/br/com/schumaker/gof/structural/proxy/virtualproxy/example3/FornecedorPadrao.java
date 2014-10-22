package br.com.schumaker.gof.structural.proxy.virtualproxy.example3;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public class FornecedorPadrao implements Fornecedor {

  //atributos e gettes e setters
    @Override
    public boolean save() {
        // lógica para salvar o fornecedor
        return true;
    }

    @Override
    public boolean alter() {
        // lógica para alterar o fornecedor
        return true;
    }

    @Override
    public boolean delete() {
        // lógica para excluir o fornecedor
        return true;
    }

    @Override
    public ResultSet list() {
        // lógica de busca
        return null;
    }
}
