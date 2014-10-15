package br.com.schumaker.nogof.creational.simplefactory.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class DataBaseFactory {

    public static final int ORACLE = 0;
    public static final int MYSQL = 1;
    public static final int AS400 = 2;
    public static final int FIREBIRD = 3;

    public DataBase getDataBase(int type) {
        if (type == ORACLE) {
            return new DataBaseOracle();
        } else if (type == MYSQL) {
            return new DataBaseMysql();
        } else if (type == AS400) {
            return new DataBaseAs400();
        } else if (type == FIREBIRD) {
            return new DataBaseFireBird();
        } else {
            return null;
        }
    }
}
