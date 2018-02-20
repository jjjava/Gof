package br.com.schumaker.nogof.creational.simplefactory.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseFactory {

    public DataBase getDataBase(Oracle oracle) {
         return new DataBaseOracle();
    }
    
     public DataBase getDataBase(As400 as400) {
         return new DataBaseAs400();
    }
}
