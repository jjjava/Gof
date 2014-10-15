
package br.com.schumaker.gof.behavioral.memento.example1;

import br.com.schumaker.gof.behavioral.memento.example1.Originator.Memento;
import java.util.ArrayList;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 10/09/2014
 */
public class Client {

    public static void main(String[] args) {
        ArrayList<Memento> savedStates = new ArrayList<>();
        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.set("State4");
        originator.restoreFromMemento(savedStates.get(1));
    }
}