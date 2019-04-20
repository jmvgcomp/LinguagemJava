package Threads.Loiane.Synchronized.CalculatorExample.entities;

public class Calculator {
    private int sum;

    public synchronized int sumArray(int[] array){
        sum = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                System.out.println("Executando a soma "+Thread.currentThread().getName() +
                        " somando o valor "+array[i]+ " com total de "+sum);
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return sum;
    }
}
