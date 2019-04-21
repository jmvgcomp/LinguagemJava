package Functional.Functions.program;

import Functional.Functions.entities.Product;
import Functional.Functions.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        //Programa que a partir de um lista de produtos, gere uma nova
        //lista contendo os nomes dos produtos em caixa alta

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 800.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD CASE", 80.90));

        //a função map, aplica uma função a todos os elementos do stream
        //stream é sequencia de dados

       //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        List<String> names = list.stream().
                map(p -> p.getName().toUpperCase()).
                collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
