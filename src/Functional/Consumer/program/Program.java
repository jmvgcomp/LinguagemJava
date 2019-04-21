package Functional.Consumer.program;

import Functional.Consumer.entities.Product;
import Functional.Consumer.util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        //Adicionar 10% no valor de cada produto.

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 800.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD CASE", 80.90));


        double desc  = 1.1;
        /*
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * desc);
        ou
        list.forEach(cons);
        */
        list.forEach(new ProductConsumer());



        list.forEach(System.out::println);
    }
}
