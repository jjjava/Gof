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
public class Client {

    public static void main(String args[]) {
        Janela janela1 = new Janela();
        janela1.setTitulo("Janela 1");
        janela1.setAltura(400);
        janela1.setLargura(600);

        Janela janela2 = janela1.clone();
        janela2.setTitulo("Janela 2");
    }
}
