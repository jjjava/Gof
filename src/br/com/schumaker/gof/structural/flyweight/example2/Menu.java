package br.com.schumaker.gof.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hudson.sales
 */
class Menu {

    private Map<String, CoffeFlavour> flavours = new HashMap<String, CoffeFlavour>();

    CoffeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName)) {
            flavours.put(flavorName, new CoffeFlavour(flavorName));
        }
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
