package br.com.schumaker.gof.behavioral.iterator.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Itens itens = new Itens();

        itens.add("Item 0");
        itens.add("Item 1");
        itens.add("Item 2");
        itens.add("Item 3");
        itens.add("Item 4");

        Iterator<String> iterator;

        iterator = itens.getIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
