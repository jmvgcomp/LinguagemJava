package List.App;

import List.Entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int quantity = sc.nextInt();
        List<Employees> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            int position = i+1;
            System.out.println("Employee #"+position+": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            sc.next();
            double salary = sc.nextDouble();
            list.add(new Employees(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employees employees = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employees == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.salaryIncrease(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("List of employees:");
        for (Employees obj : list) {
            System.out.println(obj);
        }

        sc.close();


    }
}
