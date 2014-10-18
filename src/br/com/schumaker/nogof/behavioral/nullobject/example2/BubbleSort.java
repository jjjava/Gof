package br.com.schumaker.nogof.behavioral.nullobject.example2;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/10/2014
 */
public class BubbleSort implements SortList {

    public BubbleSort() {
    }

    @Override
    public void sort(List<Integer> list) {
        bubbleSort(list);
    }

    public static void bubbleSort(List<Integer> list) {
        boolean sorted = false;

        for (int top = list.size() - 1; top > 0 && !sorted; top--) {
            sorted = true;
            for (int i = 0; i < top; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    sorted = false;

                    int temp = list.get(i);
                    list.add(i, list.get(i + 1));
                    list.add(i + 1, temp);
                }
            }
        }
    }
}