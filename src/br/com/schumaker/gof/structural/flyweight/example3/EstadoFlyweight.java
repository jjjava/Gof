package br.com.schumaker.gof.structural.flyweight.example3;

/**
 *
 * @author Hudson Schumaker
 */
public interface EstadoFlyweight {
  public void setId(int id);
  public int getId();
  public void setNome(String nome);
  public String getNome();
  public void setSigla(String sigla);
  public String getSigla();
}
