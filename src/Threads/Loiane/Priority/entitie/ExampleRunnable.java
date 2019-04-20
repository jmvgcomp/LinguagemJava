package Threads.Loiane.Priority.entitie;

public class ExampleRunnable implements Runnable {
    private String name;
    private int time;

    public ExampleRunnable(String name, int time) {
        this.name = name;
        this.time = time;
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {

            try {
                for (int i = 0; i<6; i++) {
                    System.out.println(name + " count " + i);
                    Thread.sleep(time);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(name + " terminou a execução.");
    }
}
