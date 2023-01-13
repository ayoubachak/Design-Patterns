interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
}

class NoCoinState implements State {
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

class HasCoinState implements State {
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

class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void insertCoin() {
        System.out.println("Please wait, we're already giving you a product.");
    }

    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank.");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another product.");
    }

    public void dispense() {
        vendingMachine.releaseProduct();
        if (vendingMachine.getCount() > 0) {
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            System.out.println("Out of products.");
            vendingMachine.setState(vendingMachine.getSoldOutState());
        }
    }
}

class SoldOutState implements State {
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

class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;
    private State state;
    private int count = 0;

    public VendingMachine(int count) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = count;
        if (count > 0) {
            state = noCoinState;
        } else {
            state = soldOutState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void releaseProduct() {
        if (count != 0) {
            count--;
            System.out.println("A product released.");
        }
    }

    public int getCount() {
        return count;
    }
}
