package Functional.Predicate.program;

import Functional.Predicate.entities.Product;
import Functional.Predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Fazer um programa que, a partir de uma lista de produtos
        //remova da lista, somente aqueles cujo preço mínimo seja 100.

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 800.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD CASE", 80.90));

        //aceita também a referencia do método estático (Method Reference)
        //list.removeIf(Product::staticProductPredicate);

        //aceita também a referencia do método não-estático (Method Reference)
        list.removeIf(Product::noStaticProductPredicate);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
