package br.com.schumaker.gof.behavioral.chainofresponsibility.example2;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
abstract class PurchasePower {
    protected static final double BASE = 500;
    protected PurchasePower successor;

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}
