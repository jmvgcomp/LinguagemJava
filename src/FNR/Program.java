package FNR;

import java.util.ArrayList;
import java.util.List;

class Cliente{
    String nome;
    int id;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nome;
    }
}
public class Program {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        for (int i=0;i<10;i++){
            String nome = "Cliente";
            clientes.add(new Cliente(nome,i));

        }

        for (Cliente s: clientes
             ) {
            System.out.print(s+""+s.getId()+" ");


        }


    }
}
