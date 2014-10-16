package br.com.schumaker.gof.structural.proxy.virtualproxy.example3;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public interface Fornecedor {

    public boolean save();
    public boolean alter();
    public boolean delete();
    public ResultSet list();
}
