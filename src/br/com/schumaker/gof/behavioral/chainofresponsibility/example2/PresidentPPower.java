package br.com.schumaker.gof.behavioral.chainofresponsibility.example2;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
class PresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 60 * BASE;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}