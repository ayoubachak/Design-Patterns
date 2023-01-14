public class Main {
    public static void main(String[] args) {
        // Create the chain of purchase powers
        PurchasePower manager = new ManagerPower();
        PurchasePower director = new DirectorPower();
        PurchasePower president = new PresidentPower();
        manager.setSuccessor(director);
        director.setSuccessor(president);

        // Send purchase requests
        manager.processRequest(new PurchaseRequest(450, "General"));
        manager.processRequest(new PurchaseRequest(600, "Supplies"));
        manager.processRequest(new PurchaseRequest(950, "Office Renovation"));
        manager.processRequest(new PurchaseRequest(3500, "New Office"));
    }
}
