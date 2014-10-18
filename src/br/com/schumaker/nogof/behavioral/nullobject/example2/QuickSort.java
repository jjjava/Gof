package br.com.schumaker.nogof.behavioral.nullobject.example2;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class QuickSort implements SortList {

    public QuickSort() {
    }

    @Override
    public void sort(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int ini = 0, fim = 0;
        for (int ele : list) {
            if (ele < ini) {
                ini = ele;
            }
            if (ele > fim) {
                fim = ele;
            }
        }
        quicksort(list, ini, fim);
    }

    private void quicksort(List<Integer> list, int ini, int fim) {
        int i = ini, j = fim;
        int pivot = list.get(ini + (fim - ini) / 2);
        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(list, i, j);
                i++;
                j--;
            }
        }

        if (ini < j) {
            quicksort(list, ini, j);
        }
        if (i < fim) {
            quicksort(list, i, fim);
        }
    }

    private void exchange(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.add(i, list.get(j));
        list.add(j, temp);
    }
}
