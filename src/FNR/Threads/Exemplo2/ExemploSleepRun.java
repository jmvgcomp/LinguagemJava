package FNR.Threads.Exemplo2;

public class ExemploSleepRun implements Runnable {
    private String nome;
    private int tempoHidratacao;
    public ExemploSleepRun(String nome, int tempoHidratacao){
        this.nome = nome;
        this.tempoHidratacao = tempoHidratacao;
    }

    @Override
    public void run() {
        System.out.println(nome+" Começou...");
        try{
            for(int i = 0; i<5; i++) {
                System.out.println(nome+" já percorreu "+i+" voltas");
                Thread.sleep(tempoHidratacao);
            }
        }catch (InterruptedException e){
            System.out.println(nome+ "foi interrompida.");
        }
        System.out.println(nome + "Terminou.");
    }
}
