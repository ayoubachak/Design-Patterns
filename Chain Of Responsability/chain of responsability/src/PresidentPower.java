public class PresidentPower extends PurchasePower {
    protected double getAllowable() {
        return BASE * 40;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("President will approve $" + request.getAmount());
        } else if (successor != null) {
            System.out.println( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}