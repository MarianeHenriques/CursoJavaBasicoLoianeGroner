package curso.java.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe004 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição: "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }

        //Define quantas casas decimais pode ter nessa conta
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("Vetor B: ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i])+ " ");
        }


    }

}
