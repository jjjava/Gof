package br.com.schumaker.nogof.behavioral.nullobject.example3;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class HsQuickSort implements SortList {

    public HsQuickSort() {
    }

    @Override
    public void sort(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(List<Integer> list, int left, int right) {
        int index = partition(list, left, right);
        if (left < index - 1) {
            quickSort(list, left, index - 1);
        }
        if (index < right) {
            quickSort(list, index, right);
        }
    }

    private int partition(List<Integer> list, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = list.get((left + right) / 2);
        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }
}
