public class ManagerPower extends PurchasePower {
    protected double getAllowable(){
        return BASE * 10;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < getAllowable()) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}