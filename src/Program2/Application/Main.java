package Program2.Application;

import Program2.Entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Bank bank;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println();
        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.println();
        System.out.print("Is there initial deposit? (y/n): ");
        char response = sc.next().charAt(0);
        System.out.println();
        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            bank = new Bank(number, accountHolder, initalDeposit);
        }else{
            bank = new Bank(number, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double despositvalue = sc.nextDouble();
        bank.deposit(despositvalue);
        System.out.println();
        System.out.print("Update account: ");
        System.out.println(bank);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdraw(withdraw);
        System.out.println();
        System.out.print("Update account: ");
        System.out.println(bank);
        sc.close();
    }
}
