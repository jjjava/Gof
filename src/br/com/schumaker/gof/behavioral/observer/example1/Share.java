package br.com.schumaker.gof.behavioral.observer.example1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class Share {
    
    private String code;
    private double price;
    private Set<ShareObserver> observers;
    
    public Share(String code, double price) {
        this.code = code;
        this.price = price;
        this.observers = new HashSet<>();
    }
    
    public void attach(ShareObserver shareObserver) {
        observers.add(shareObserver);
    }
    
    public void detach(ShareObserver shareObserver) {
        observers.remove(shareObserver);
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        for(ShareObserver s: observers){
            s.notifyChange(this);
        }
    }
}
