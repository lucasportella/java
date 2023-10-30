package application;

import java.util.Scanner;

import entities.Banking;

public class BankingApp {
    public static void main(String[] args) {
        Banking bankingAccount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        Integer accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n): ");
        String isThereInitialDeposit = sc.next();
        if (isThereInitialDeposit.equals("y") || isThereInitialDeposit.equals("yes")) {
            System.out.print("Enter initial deposit value: ");
            Double initialDeposit = sc.nextDouble();
            bankingAccount = new Banking(accountNumber, accountHolder, initialDeposit);
        } else {
            bankingAccount = new Banking(accountNumber, accountHolder);
        }
        bankingAccount.displayAccountData();
        System.out.print("Enter a deposit value: ");
        bankingAccount.deposit(sc.nextDouble());
        bankingAccount.displayUpdatedAccountData();
        System.out.print("Enter a withdraw value: ");
        bankingAccount.withdraw(sc.nextDouble());
        bankingAccount.displayUpdatedAccountData();
        sc.close();
    }
}
