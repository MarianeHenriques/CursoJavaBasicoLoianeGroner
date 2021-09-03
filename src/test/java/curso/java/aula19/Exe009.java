package curso.java.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe009 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor do vetorA da posição: "+i);
            vetorA[i] = scan.nextInt();

        }

        for (int i=0; i<vetorB.length; i++){
            System.out.println("Digite o valor do vetorB da posição: "+i);
            vetorB[i] = scan.nextInt();

        }

        for (int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];

        }

        System.out.print("Vetor A: ");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ ", ");
        }
        System.out.print("Vetor B: ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ ", ");
        }

        DecimalFormat dc = new DecimalFormat("###,###.###");

        System.out.print("Vetor C: ");
        for (int i = 0; i<vetorC.length; i++){
            System.out.print(dc.format(vetorC[i])+ ", ");
        }


    }

}
