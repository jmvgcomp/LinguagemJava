package Vectors;

public class Program1 {
    public static void main(String[] args) {
        double[] vetor = new double[3];
        vetor[0] = 1.72;
        vetor[1] = 1.56;
        vetor[2] = 1.80;
        double result = 0;
        for (int i = 0; i < vetor.length; i++){
             result += vetor[i];
        }
        System.out.println("AVERAGE HEIGHT = "+ result/vetor.length);
    }
}
