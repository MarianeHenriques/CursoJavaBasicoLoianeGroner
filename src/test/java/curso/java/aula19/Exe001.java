package curso.java.aula19;

import java.util.Scanner;

public class Exe001 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        // o segundo vetor terá o mesmos valor que o A
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição: "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

            /* for (int i=0; i<vetorA.length; i++){
                 vetorB[i] = vetorA[i];
             }*/

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
