package Functional.Stream.Exercise2.program;

import Functional.Stream.Exercise2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        /*
        * Fazer um programa para ler os dados (nome, email e salário)
        * de funcionários apartir de umar quivo em
        * formato.csv.
        * Em seguida mostrar, em ordem alfabética,
        * o email dos funcionários cujo salário seja superior a um
        * dado valor fornecido pelo usuário.
        * Mostrar também a soma dos salários dos funcionários
        * cujo nome começa com aletra'M'
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "C:\\Estudo\\Java\\src\\Functional\\Stream\\Exercise2\\data.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            employeeList.forEach(System.out::println);

            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = employeeList.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

            emails.forEach(System.out::println);

            double sum = employeeList.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
