package Generics.Map.InititalExample;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "987111122");
        cookies.put("phone", "881115554"); //sobrescreve o valor anterior

        System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
        System.out.println("Phone number: "+cookies.get("phone"));
        System.out.println("Size: "+cookies.size());
        //cookies.remove("email");
        System.out.println("ALL COOKIES");
        for (String key: cookies.keySet()
             ) {
            System.out.println(key + ": "+ cookies.get(key));

        }
    }
}
