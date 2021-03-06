package br.com.fnr.tap.Threads.view;

import br.com.fnr.tap.Threads.controller.Controlador;
import br.com.fnr.tap.Threads.controller.Correios;
import br.com.fnr.tap.Threads.controller.Correios2;
import br.com.fnr.tap.Threads.services.Pacotes;
import br.com.fnr.tap.Threads.services.TipoEntrega;


public class Program {
    public static void main(String[] args) {

        Controlador<Pacotes> pacotesControlador = new Controlador<>();
        Thread t1 = new Thread(new Correios(pacotesControlador,10, 10), String.valueOf(TipoEntrega.randomEntrega()));
        Thread t2 = new Thread(new Correios2(pacotesControlador,10, 10), String.valueOf(TipoEntrega.randomEntrega()));

        t1.start();
        t2.start();

        for(int i=0; i<10; i++){
            pacotesControlador.add(Pacotes.randomSERVICE());
        }
        pacotesControlador.encerrando();

    }
}
