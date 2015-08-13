package br.com.schumaker.gof.behavioral.chainofresponsibility.example2;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
class ManagerPPower extends PurchasePower {
    private final double ALLOWABLE = 10 * BASE;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}