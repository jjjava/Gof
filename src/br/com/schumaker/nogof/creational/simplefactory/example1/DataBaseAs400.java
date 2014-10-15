package br.com.schumaker.nogof.creational.simplefactory.example1;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseAs400 implements DataBase {

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
