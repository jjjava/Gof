package br.com.schumaker.gof.structural.proxy.virtualproxy.example3;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public class ProxyFornecedor implements Fornecedor {

    private Fornecedor fornecedor;

    public ProxyFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public boolean save() {
        // lógica para registrar a operação
        return this.fornecedor.save();
    }

    @Override
    public boolean alter() {
        // lógica para registrar a operação
        return this.fornecedor.alter();
    }

    @Override
    public boolean delete() {
        // lógica para registrar a operação
        return this.fornecedor.delete();
    }

    @Override
    public ResultSet list() {
        // lógica para registrar a operação
        return this.fornecedor.list();
    }
}
