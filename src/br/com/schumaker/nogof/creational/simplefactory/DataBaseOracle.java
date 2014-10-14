package br.com.schumaker.nogof.creational.simplefactory;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseOracle implements DataBase {

    @Override
    public boolean save() {
        //...
        return false;
    }

    @Override
    public boolean merge() {
        //...
        return false;
    }

    @Override
    public List<?> search() {
        //...
        return null;
    }

    @Override
    public boolean delete() {
        //...
        return false;
    }
}
