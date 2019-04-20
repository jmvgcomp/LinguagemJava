package br.com.fnr.tap.Threads.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorClientes {
    public List gerar(int num){
        List<String> clientes = new ArrayList<>();
        for(int i=1; i<=num; i++){
            clientes.add("Cliente"+i);
        }
        return clientes;
    }

    public String getCliente(List e){
        return String.valueOf(e.get(new Random().nextInt(e.size())));
    }
}
