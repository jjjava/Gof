package br.com.schumaker.nogof.creational.simplefactory.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {
    public static void main(String[] args){
        DataBaseFactory dataBaseFactory = new DataBaseFactory();
        DataBase dataBaseOracle = dataBaseFactory.getDataBase(DataBaseFactory.ORACLE);
        dataBaseOracle.merge();
        
        DataBase dataBaseAs400 = dataBaseFactory.getDataBase(DataBaseFactory.AS400);
        dataBaseAs400.save();
    }
}
