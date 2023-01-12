// Facade Class
class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        accountChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() { return accountNumber; }
    public int getSecurityCode() { return securityCode; }

    public void withdrawCash(double cashToGet){
        if(accountChecker.accountActive(getAccountNumber()) &&
           codeChecker.isCodeCorrect(getSecurityCode()) &&
           fundsChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit){
        if(accountChecker.accountActive(getAccountNumber()) &&
           codeChecker.isCodeCorrect(getSecurityCode())) {
            fundsChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}

// Subsystem classes
class WelcomeToBank {
    public WelcomeToBank(){
        System.out.println("Welcome to ABC Bank");
        System.out.println("We are happy to give you your money if we can find it\n");
    }
}

class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){
        if(acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}

class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}

class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn ) { cashInAccount -= cashWithdrawn; }
   
    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if(cashToWithdraw > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdraw Complete: Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }
}
