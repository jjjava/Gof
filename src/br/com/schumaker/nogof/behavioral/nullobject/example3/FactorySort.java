package br.com.schumaker.nogof.behavioral.nullobject.example3;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class FactorySort {

    public static final String BUBBLESORT = "BubbleSort";
    public static final String QUICKSORT = "QuickSort";
    private static final FactorySort INSTANCE = new FactorySort();

    private FactorySort() {
    }

    public static FactorySort getInstance() {
        return INSTANCE;
    }

    public SortList getSort(String sortName) {
        if (sortName.equalsIgnoreCase(BUBBLESORT)) {
            return (SortList) new HsBubbleSort();
        } else if (sortName.equalsIgnoreCase(QUICKSORT)) {
            return (SortList) new HsQuickSort();
        } else {
            return (SortList) new NullSort();
        }
    }
}