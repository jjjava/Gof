/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.gof.creational.prototype.example1;

/**
 *
 * @author hudson.sales
 */
public class Janela implements Prototype<Janela> {

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
    public Janela clone() {
        //lógica para criar a cópia
        return this;
    }
}
