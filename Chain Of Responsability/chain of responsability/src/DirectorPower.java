public class DirectorPower extends PurchasePower {
    protected double getAllowable() {
        return BASE * 20;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
