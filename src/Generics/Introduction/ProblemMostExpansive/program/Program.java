package Generics.Introduction.ProblemMostExpansive.program;

import Generics.Introduction.ProblemMostExpansive.entities.Product;
import Generics.Introduction.ProblemMostExpansive.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "C:\\temp\\in2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: "+x);
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
