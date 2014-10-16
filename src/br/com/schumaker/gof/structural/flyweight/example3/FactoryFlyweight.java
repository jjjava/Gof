package br.com.schumaker.gof.structural.flyweight.example3;

import java.util.HashMap;

/**
 *
 * @author Hudson Schumaker
 */
public class FactoryFlyweight {

    private static HashMap<String, Estado> estados = new HashMap<>();

    public static Estado getEstado(String nome) {
        if (!estados.containsKey(nome)) {
            estados.put(nome, new Estado(nome));
        }
        return estados.get(nome);
    }
}
