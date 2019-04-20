package FNR.Threads.Exemplo1;

public class EnviaThread extends Thread {
    private String msg;
    private Enviar enviar;

    EnviaThread(String m, Enviar obj){
        msg = m;
        enviar = obj;
    }
    @Override
    public void run(){
        synchronized (enviar){
            enviar.envia(msg);
        }
    }
}

