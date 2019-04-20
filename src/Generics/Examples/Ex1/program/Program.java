package Generics.Examples.Ex1.program;

import Generics.Examples.Ex1.entities.UserLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\temp\\logAcessJava.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<UserLog> log = new HashSet<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                log.add(new UserLog(username, moment));
                line = br.readLine();
            }
            for (UserLog u : log){
                System.out.println(u);
            }
            System.out.println("Total users: "+log.size());
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
