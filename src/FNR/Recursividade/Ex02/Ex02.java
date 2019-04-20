package FNR.Recursividade.Ex02;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(quadrado(2));
    }
    public static int quadrado(int n){
        if(n==0)
            return 0;
        else
            return (n*n) + quadrado(0) ;
    }
}
