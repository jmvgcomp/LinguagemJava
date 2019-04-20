package Generics.Set;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set){
            System.out.println(p);
        }
    }
}
