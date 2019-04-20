package br.com.fnr.tap.Threads.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Pacotes {
    GRANDE(1000), MEDIO(500), PEQUENO(250);

    private int time;
    private static final List<Pacotes> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Pacotes randomSERVICE()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    Pacotes(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }
}
