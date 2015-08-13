package br.com.schumaker.gof.behavioral.chainofresponsibility.example2;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
class DirectorPPower extends PurchasePower {
    private final double ALLOWABLE = 20 * BASE;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
