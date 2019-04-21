package Functional.Comparable.program;

import Functional.Comparable.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 800.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
