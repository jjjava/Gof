package br.com.schumaker.nogof.creational.simplefactory.example3;

/**
 *
 * @author hudson.schumaker
 */
public abstract class DataBaseType {
    
    private int id;
    private String nome;

    public DataBaseType() {
    }

    public DataBaseType(int id) {
        this.id = id;
    }

    public DataBaseType(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
