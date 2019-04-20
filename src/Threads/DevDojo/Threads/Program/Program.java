package Threads.DevDojo.Threads.Program;


//Threads Daemon x User
//Thread Daemon Ex: Garbage Collector
class ThreadExample extends Thread{
    private char c;
    int time;
    public ThreadExample(char c, int time) {
        this.c = c;
        this.time = time;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.print(c);
            if(i%100 == 0){
                System.out.println();
            }
        }
    }

}

class ThreadExemploRunable implements Runnable{
    private char c;

    public ThreadExemploRunable(char c) {
        this.c = c;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program{
    public static void main(String[] args) {
        System.out.println("Thread executando: "+Thread.currentThread().getName());
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');

        Thread t1 = new Thread(new ThreadExemploRunable('A'), "T1");
        Thread t2 = new Thread(new ThreadExemploRunable('B'), "T2");
        Thread t3 = new Thread(new ThreadExemploRunable('C'), "T3");
        Thread t4 = new Thread(new ThreadExemploRunable('D'), "T4");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
