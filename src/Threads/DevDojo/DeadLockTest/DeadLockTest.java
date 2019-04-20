package Threads.DevDojo.DeadLockTest;

public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }
    static class ThreadExemplo1 extends Thread {

        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread1: segurando lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1: esperando lock 2");
            synchronized (lock2){
                System.out.println("Thread1 segurando lock 1 e lock2");
                }
            }
        }
    }

    static class ThreadExemplo2 extends Thread {

        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread2: segurando lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: esperando lock 1");
                synchronized (lock1){
                    System.out.println("Thread1 segurando lock 2 e lock1");
                }
            }
        }
    }
}

