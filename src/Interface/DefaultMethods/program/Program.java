package Interface.DefaultMethods.program;

import Interface.DefaultMethods.entites.BrazilInterestService;
import Interface.DefaultMethods.entites.InterestService;
import Interface.DefaultMethods.entites.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after "+months+" months: ");
        System.out.print(String.format("%.2f", payment));

    }
}
