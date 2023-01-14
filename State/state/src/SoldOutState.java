public class SoldOutState implements State {
    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void insertCoin() {
        System.out.println("Out of products.");
    }

    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank.");
    }

    public void turnCrank() {
        System.out.println("Out of products.");
    }

    public void dispense() {
        System.out.println("Out of products.");
    }
}