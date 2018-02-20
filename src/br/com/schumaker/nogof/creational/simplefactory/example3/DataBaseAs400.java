package br.com.schumaker.nogof.creational.simplefactory.example3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseAs400 implements DataBase {

    @Override
    public boolean save() {
        //...
        System.out.println("save...");
        return false;
    }

    @Override
    public boolean merge() {
        //...
        return false;
    }

    @Override
    public List<String> search() {
        //...
        List<String> lista = new  ArrayList<>();
        lista.add("teste");
        lista.add("teste2");
        lista.add("teste3");
        return lista;
    }

    @Override
    public boolean delete() {
        //...
        return false;
    }
}
