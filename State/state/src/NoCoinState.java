public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no coin.");
    }

    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
