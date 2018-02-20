package br.com.schumaker.nogof.creational.simplefactory.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {
    public static void main(String[] args){
        DataBaseFactory dataBaseFactory = new DataBaseFactory();
        DataBase dataBaseOracle = dataBaseFactory.getDataBase(new Oracle());
        dataBaseOracle.merge();
        
        DataBase dataBaseAs400 = dataBaseFactory.getDataBase(new As400());
        dataBaseAs400.save();
        System.out.println(dataBaseAs400.search().size());
    }
}
