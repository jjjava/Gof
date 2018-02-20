package br.com.schumaker.nogof.creational.simplefactory.example3;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseOracle implements DataBase {

    @Override
    public boolean save() {
        System.out.println("save...");
        return false;
    }

    @Override
    public boolean merge() {
        System.out.println("merge...");
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
