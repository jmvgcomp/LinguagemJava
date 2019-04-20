package FNR.Threads.Exemplo1;

public class Program {
    public static void main(String[] args) {
       Enviar enviar = new Enviar();
       EnviaThread s1 = new EnviaThread(" Olá ", enviar);
       EnviaThread s2 = new EnviaThread(" Xau ", enviar);
       s1.start();
       s2.start();
       try{
           s1.join();
           s2.join();
       }catch (Exception e){
           System.out.println("Thread interrompida");
       }
    }
}
