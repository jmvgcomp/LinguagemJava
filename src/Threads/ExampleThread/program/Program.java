package Threads.ExampleThread.program;

import Threads.ExampleThread.entitie.ThreadExample;

public class Program {
    public static void main(String[] args) {

        ThreadExample th = new ThreadExample("Thread #1 ", 700);

        ThreadExample th2 = new ThreadExample("Thread #2 ", 900);


    }
}
