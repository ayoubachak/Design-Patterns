import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the security code: ");
        int securityCode = sc.nextInt();

        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(990.00);

        System.out.println("Enter the deposit amount: ");
        double cashToDeposit = sc.nextDouble();
        accessingBank.depositCash(cashToDeposit);
        sc.close();
    }
}
