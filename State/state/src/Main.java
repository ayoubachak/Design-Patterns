class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);
        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
        vendingMachine.insertCoin();
        vendingMachine.turnCrank();
        vendingMachine.ejectCoin();
        vendingMachine.turnCrank();
    }
}
