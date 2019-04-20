package br.com.fnr.tap.Threads.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TipoEntrega {
    PAC(2000), SEDEX(1000), SEDEX10(500), ESEDEX(500);
    private int time;
    private static final List<TipoEntrega> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TipoEntrega randomEntrega()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    TipoEntrega(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }

}
