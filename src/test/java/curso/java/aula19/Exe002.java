package curso.java.aula19;

import java.util.Scanner;

public class Exe002 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição: "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.println(vetorB[i]);
        }

    }

}
