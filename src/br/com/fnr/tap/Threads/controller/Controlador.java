package br.com.fnr.tap.Threads.controller;

import java.util.LinkedList;
import java.util.Queue;

public class Controlador<T> implements Controller{
    private final Queue<T> t = new LinkedList<>();
        private int time;




    private boolean pendente = true;

    public Controlador() {
        this.time = time;
    }

    private int calculaTime(int tempoPacote, int tempoEntrega){
        return 0;
    }

    @Override
    public int getPendente() {
        synchronized (t){
            return this.t.size();
        }
    }

    @Override
    public boolean isPendente() {
        return pendente;
    }

    @Override
    public String obter() {
        String t = null;
        try{
            synchronized (this.t){
                while (this.t.size() == 0){ //deve-se esperar
                    if(!pendente) return null;
                    System.out.println("Sem pacotes pendentes ");
                    this.t.wait();
                }
                t = String.valueOf(this.t.poll());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return t;
    }

    public void add(T t) {
        synchronized (this.t){
            this.t.add(t);
            System.out.println("Encomenda solicitada");
            System.out.println("Notificando serviços que estão em espera");
            this.t.notifyAll();
        }
    }
    public void encerrando(){
        System.out.println("Verificações concluidas.");
        pendente = false;
        synchronized (this.t){
            this.t.notifyAll();
        }
    }
}
