package br.com.schumaker.gof.behavioral.chainofresponsibility.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Numbers {

    private int n1;
    private int n2;
    private String calculatioWantend;

    public Numbers(int n1, int n2, String calculatioWantend) {
        this.n1 = n1;
        this.n2 = n2;
        this.calculatioWantend = calculatioWantend;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getCalculatioWantend() {
        return calculatioWantend;
    }

    public void setCalculatioWantend(String calculatioWantend) {
        this.calculatioWantend = calculatioWantend;
    }
}
