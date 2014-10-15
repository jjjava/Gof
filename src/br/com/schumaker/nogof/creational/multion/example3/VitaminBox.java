/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.nogof.creational.multion.example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hudson Schumaker
 */
public class VitaminBox {

    private static Map<String, VitaminBox> boxes = new HashMap<String, VitaminBox>();
    private List<Vitamin> vits = new ArrayList<Vitamin>();

    public static void add(Vitamin vit) {
        getVitaminBox(vit.getName()) // get VitaminBox by Vitamin name
                .getVitamins(). // get Vitamin list
                add(vit); // add Vitamin
    }

    public Vitamin getVitamin() {
        if (vits.size() > 0) {
            return vits.get(0);
        }
        return null;
    }

    public int getVitaminAmount() {
        return vits.size();
    }

    public static Set<Map.Entry<String, VitaminBox>> getEntries() {
        return boxes.entrySet();
    }

    private List<Vitamin> getVitamins() {
        return vits;
    }

    private static VitaminBox getVitaminBox(String name) {
        // try to get box
        VitaminBox box = boxes.get(name);
        if (box == null) {
            synchronized (boxes) {
                box = boxes.get(name);
                // create new if not exists
                if (box == null) {
                    box = new VitaminBox();
                    boxes.put(name, box);
                }
            }
        }
        return box;
    }
}
