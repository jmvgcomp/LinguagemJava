package FNR.Threads.Exemplo2;

public class Program {
    public static void main(String[] args) {
        ExemploSleepRun t1 = new ExemploSleepRun("José", 1200);
        ExemploSleepRun t2 = new ExemploSleepRun("Maria", 900);
        ExemploSleepRun t3 = new ExemploSleepRun("Pedro", 500);
        ExemploSleepRun t4 = new ExemploSleepRun("Elaine", 870);
        Thread t1_1 = new Thread(t1);
        Thread t2_2 = new Thread(t2);
        Thread t3_3 = new Thread(t3);
        Thread t4_4 = new Thread(t4);
        t1_1.setPriority(5);
        t2_2.setPriority(3);
        t3_3.setPriority(1);
        t4_4.setPriority(2);
        t1_1.start();
        t2_2.start();
        t3_3.start();
        t4_4.start();
    }
}
