package br.com.schumaker.gof.structural.flyweight.example3;

/**
 *
 * @author Hudson Schumaker
 */
public class Estado implements EstadoFlyweight {

    private int id;
    private String nome;
    private String sigla;

    public Estado(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Estado(String nome) {
        //busca as informações do estado pelo nome.
        this.nome = nome;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String getSigla() {
        return this.sigla;
    }
}
