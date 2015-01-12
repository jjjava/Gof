/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.schumaker.gof.creational.prototype.example2;

/**
 *
 * @author hudson.sales
 */
public class Janela implements Cloneable {
  private String titulo;
  private int altura;
  private int largura;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getLargura() {
    return largura;
  }

  public void setLargura(int largura) {
    this.largura = largura;
  }

  @Override
  public Janela clone(){
    try {
      return (Janela) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new IllegalArgumentException("Clone não suportado");
    }
  }
}