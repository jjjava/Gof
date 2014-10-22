package br.com.schumaker.gof.behavioral.iterator.example1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hudson Schumaker
 */
public class Itens implements Aggregate {

    private Map<Integer, String> itens;
    private int index;

    public Itens() {
        itens = new HashMap<Integer, String>();
        index = 0;
    }

    public void add(String item) {
        this.itens.put(index, item);
        index++;
    }

    public String remove(String item) {
        return this.itens.remove(item);
    }

    public int getNumberOfItems() {
        return this.itens.size();
    }

    @Override
    public Iterator<String> getIterator() {
        return new ConcreteIterator(itens);
    }
}
