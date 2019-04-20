package Threads.ExampleRunnable.program;

import Threads.ExampleRunnable.entitie.ExampleRunnable;

public class Program  {
    public static void main(String[] args) {
        ExampleRunnable er = new ExampleRunnable("Thread #1", 300);
        ExampleRunnable er2 = new ExampleRunnable("Thread #2", 400);
        ExampleRunnable er3 = new ExampleRunnable("Thread #3", 500);

        Thread t1 = new Thread(er);
        Thread t2 = new Thread(er2);
        Thread t3 = new Thread(er3);

        t1.start();
        t2.start();
        t3.start();
        try {  //espera a execução das threads acabarem
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
