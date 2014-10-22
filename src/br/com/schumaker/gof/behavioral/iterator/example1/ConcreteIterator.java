package br.com.schumaker.gof.behavioral.iterator.example1;

import java.util.Map;

/**
 *
 * @author Hudson Schumaker
 */
public class ConcreteIterator implements Iterator<String> {

    private Map<Integer, String> itens;
    private int index;

    public ConcreteIterator(Map<Integer, String> itens) {
        this.itens = itens;
        index = -1;
    }

    @Override
    public String first() {
        return itens.get(0);
    }

    @Override
    public String next() {
        index++;
        return itens.get(index);
    }

    @Override
    public boolean isDone() {
        if (index > itens.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String currentItem() {
        return itens.get(index);
    }
}
