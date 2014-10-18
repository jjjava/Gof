package br.com.schumaker.nogof.behavioral.nullobject.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class Client {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int k = 0; k < 10000000; k++) {
            list.add(rnd.nextInt());
        }

        SortList ordernar = new HsQuickSort();
        ordernar.sort(list);

        for (int t : list) {
            System.out.println(t);
        }
    }
}
