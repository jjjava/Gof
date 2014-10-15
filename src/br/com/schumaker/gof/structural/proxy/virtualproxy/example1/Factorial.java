package br.com.schumaker.gof.structural.proxy.virtualproxy.example1;

/**
 *
 * @author Hudson Schumaker
 */
public class Factorial implements FormulaCalc {

    private long result;

    public Factorial(int n) {
        calc(n);
    }

    @Override
    public Number getResult() {
        return result;
    }

    private void calc(int n) {
        System.out.println("Calculate the factorial of " + n);
        result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
    }
}