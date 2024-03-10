package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String clientName = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char hasInitialDeposit = sc.next().charAt(0);

        Account account;

        if (hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, clientName, initialDeposit);
        }else {
             account = new Account(accountNumber, clientName);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
