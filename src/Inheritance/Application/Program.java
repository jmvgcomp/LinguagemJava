package Inheritance.Application;

import Inheritance.Entities.Account;
import Inheritance.Entities.BusinessAccount;
import Inheritance.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        //'if' not necessary *
        if(account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }
        if (account3 instanceof SavingsAccount){
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }

    }
}
