package FNR.Threads.Exemplo1;

public class Enviar {
    public synchronized void envia(String msg){
        System.out.println("Enviando\t"+msg);
        try{
            Thread.sleep(1000);

        }catch (Exception e){
            System.out.println("Thread interrompido");
        }
        System.out.println("\n"+msg +" enviada.");
    }
}
