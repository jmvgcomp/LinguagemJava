package Threads.Loiane.Synchronized.CalculatorExample.entities;

public class ThreadSum implements Runnable {
    private String name;
    private int[] numbers;
    private static Calculator cal = new Calculator();

    public ThreadSum(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println(this.name + " iniciada ");
        int sum = cal.sumArray(this.numbers);
        System.out.println("O resultado da soma para thread "+this.name+" é: "+sum);
        System.out.println(this.name + " terminada.");
    }
}
