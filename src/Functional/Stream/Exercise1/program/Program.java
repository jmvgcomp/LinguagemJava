package Functional.Stream.Exercise1.program;

import Functional.Stream.Exercise1.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Estudo\\Java\\src\\Functional\\Stream\\Exercise1\\products.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //Pipeline
            //armazena o preço médio de todos os produtos
            double avg = list.stream()
                    .map(Product::getPrice)
                                        //(x,y) -> x+y
                    .reduce(0.0, Double::sum) / list.size();

            System.out.println("Average price: "+String.format("%.2f", avg));
                                        //(s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase())
            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg) //filtra produtos com preço menor que a média
                    .map(Product::getName) // pega apenas os nomes dos produtos
                    .sorted(comp.reversed()) //inverte de ordem crescente para decrescente
                    .collect(Collectors.toList()); //converte para lista

            names.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
