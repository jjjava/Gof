package br.com.schumaker.nogof.behavioral.nullobject.example2;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class FactorySort {

    public SortList getSort(String sortName) {
        try {
            if (Class.forName(sortName) != null) {
                return  (SortList) Class.forName(sortName).getConstructor().newInstance();
            } else {
                return new NullSort();
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            System.err.println(e);
            System.out.println("Retornando um NullSort object");
            return new NullSort();
        }
    }
}
