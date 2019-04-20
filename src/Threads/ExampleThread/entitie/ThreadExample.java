package Threads.ExampleThread.entitie;

public class ThreadExample extends Thread {
    private String name;
    private int time;
    public ThreadExample(String name, int time) {
        this.name = name;
        this.time = time;
        start();
    }

    @Override
    public void run(){

            try {
                for (int i=0; i<6; i++) {
                    System.out.println(name + " count " + i);
                    Thread.sleep(time);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Executando a thread");
    }
}
