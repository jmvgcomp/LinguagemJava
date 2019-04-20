package br.com.fnr.tap.Threads.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorLojista {
    public List gerar(int num){
        List<String> lojista = new ArrayList<>();
        for(int i=1; i<=num; i++){
            lojista.add("Lojista"+i);
        }
        return lojista;
    }

    public String getLojista(List e){
        return String.valueOf(e.get(new Random().nextInt(e.size())));
    }
}
