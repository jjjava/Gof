/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.nogof.creational.multion.example3;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hudson
 */
public class Client {

    public static void main(String[] args) {
        VitaminBox.add(new Vitamin("Vitamin C"));
        VitaminBox.add(new Vitamin("Vitamin C"));
        VitaminBox.add(new Vitamin("Vitamin A"));
        VitaminBox.add(new Vitamin("Vitamin A"));
        VitaminBox.add(new Vitamin("Vitamin B"));
        Set<Map.Entry<String, VitaminBox>> entries = VitaminBox.getEntries();
        System.out.println("There are " + entries.size() + " VitaminBox(es).");
        for (Map.Entry<String, VitaminBox> entry : entries) {
            String name = entry.getKey();
            System.out.println(entry.getValue().getVitaminAmount() + " " + name
                    + " in " + name + " box");
        }
    }
}
