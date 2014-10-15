/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.gof.creational.decorator.example3;

/**
 *
 * @author Hudson
 */
public class MassaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza";
    }

    @Override
    public double getCusto() {
        return 2.00;
    }
}
