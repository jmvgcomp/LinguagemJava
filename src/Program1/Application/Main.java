package Program1.Application;

import Program1.Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        double percentage;
        System.out.print("Nome: ");
        employee.name = sc.next();
        System.out.println();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.NetSalary());
        System.out.println();
        System.out.print("Wich percentage to increase salary: ");
        percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println();
        System.out.printf("Update data: %s, $ %.2f", employee.name, employee.NetSalary());
    }
}
