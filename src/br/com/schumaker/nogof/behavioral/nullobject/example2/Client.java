package br.com.schumaker.nogof.behavioral.nullobject.example2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class Client {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(30);
        list.add(13);
        list.add(11);
        list.add(55);
        list.add(44);
        list.add(3);
        list.add(0);
        list.add(34);

        FactorySort factory = new FactorySort();

        SortList ordernar = factory.getSort("MergeSort");
        ordernar.sort(list);

        ordernar = factory.getSort("br.com.schumaker.nogof.behavioral.nullobject.example2.BubbleSort");
        ordernar.sort(list);

//        ordernar = factory.getSort("QuickSort");
//        ordernar.sort(list);
//
//        ordernar = new QuickSort();
//        ordernar.sort(list);
        
        
        for(int t :list){
            System.out.println(t);
        }
    }
}
