package br.com.fnr.tap.Threads.controller;

import br.com.fnr.tap.Threads.entites.GeradorClientes;
import br.com.fnr.tap.Threads.entites.GeradorLojista;
import br.com.fnr.tap.Threads.services.Pacotes;
import br.com.fnr.tap.Threads.services.TipoEntrega;

import java.util.List;

public class Correios2 implements Runnable {
    private Controlador<Pacotes> pacote;
    private GeradorClientes clientes = new GeradorClientes();
    private GeradorLojista lojistas = new GeradorLojista();
    private List listClientes;
    private List listLojista;

    public Correios2( Controlador<Pacotes> pacote, int qtdClientes, int qtdLojistas) {
        this.pacote = pacote;
        listClientes = clientes.gerar(qtdClientes);
        listLojista = lojistas.gerar(qtdLojistas);

    }


    private int getTime() {

        return (int) (Math.random()*5)*Pacotes.randomSERVICE().getTime() + TipoEntrega.randomEntrega().getTime();
    }


    @Override
    public void run() {
        String threadNome = Thread.currentThread().getName();
        System.out.println(threadNome + " começando trabalho de entrega");
        int qtdPendentePacotes = pacote.getPendente();
        boolean pendente = pacote.isPendente();
        while (pendente || qtdPendentePacotes > 0){

            String cliente = clientes.getCliente(listClientes);
            String lojista = lojistas.getLojista(listLojista);
            try{
                String pacote = this.pacote.obter();
                if(pacote != null){
                    System.out.println(lojista+" enviando pacote "+ pacote +" via "+ threadNome +" para "+cliente);
                    Thread.sleep(getTime());
                    System.out.println("Pacote recebido com sucesso por "+cliente);
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            pendente = pacote.isPendente();
            qtdPendentePacotes = pacote.getPendente();
        }
        System.out.println("Atividades finalizadas");
    }
}
