package br.com.schumaker.gof.creational.decorator.example4;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Turma {

    private int idturma;
    private String nome;

    public abstract void save();
    public abstract void alterar();
    public abstract void excluir();

    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
