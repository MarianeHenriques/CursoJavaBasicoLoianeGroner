package curso.java.aula19;

import java.util.Scanner;

public class Exe007 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor do vetorA da posição: "+i);
            vetorA[i] = scan.nextInt();

        }

        for (int i=0; i<vetorB.length; i++){
            System.out.println("Digite o valor do vetorB da posição: "+i);
            vetorB[i] = scan.nextInt();

        }

        for (int i=0; i<vetorB.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];

        }

        System.out.print("Vetor A: ");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ ", ");
        }
        System.out.print("Vetor B: ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ ", ");
        }
        System.out.print("Vetor C: ");
        for (int i = 0; i<vetorC.length; i++){
            System.out.print(vetorC[i]+ ", ");
        }


    }

}
