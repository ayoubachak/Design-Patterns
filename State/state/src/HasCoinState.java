public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    public void ejectCoin() {
        System.out.println("Coin returned.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("You turned but didn't choose any product.");
    }
}

