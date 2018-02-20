package br.com.schumaker.gof.behavioral.templatemethod.example2;

/**
 *
 * @author hudson.schumaker
 */
public abstract class Conta {

    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
        this.saldo -= this.calculaTaxa();
    }

    public void saca(double valor) {
        this.saldo -= valor;
        this.saldo -= this.calculaTaxa();
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calculaTaxa();
}
