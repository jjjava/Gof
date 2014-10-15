package br.com.schumaker.gof.structural.proxy.virtualproxy.example1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hudson
 */
public class ProxyFactorial implements FormulaCalc {

    private static Map<Integer, Factorial> cache = new HashMap<Integer, Factorial>();
    private int n;

    public ProxyFactorial(int n) {
        this.n = n;
    }

    @Override
    public Number getResult() {
        if (!cache.containsKey(n)) {
            synchronized (cache) {
                if (!cache.containsKey(n)) {
                    cache.put(n, new Factorial(n));
                }
            }
        }
        Factorial fac = cache.get(n);
        return fac.getResult();
    }
}
