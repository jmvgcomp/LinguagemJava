package Vectors.Examples.App;

import Vectors.Examples.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Product[] products = new Product[num];
        String name;
        double price;
        for(int i=0; i<num; i++){
            name = sc.next();
            price = sc.nextDouble();
            products[i] = new Product(name, price);
        }
        double result=0;
        for (int i=0; i<num; i++){
            result += products[i].getPrice();
        }
        System.out.println("Avarage price = "+result/num);
        sc.close();
    }
}
