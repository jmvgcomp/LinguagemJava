package Threads.Loiane.Priority.program;

import Threads.Loiane.Priority.entitie.ExampleRunnable;

public class Program  {
    public static void main(String[] args) {
        ExampleRunnable thread1 = new ExampleRunnable("Thread #1", 500);
        ExampleRunnable thread2 = new ExampleRunnable("Thread #2", 500);
        ExampleRunnable thread3 = new ExampleRunnable("Thread #3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
