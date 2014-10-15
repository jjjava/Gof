package br.com.schumaker.nogof.creational.simplefactory.example2;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Bread {

    private String description = "Bread";

    public Bread(String desc) {
        description = desc;
    }

    public String getDesc() {
        return description;
    }
}
