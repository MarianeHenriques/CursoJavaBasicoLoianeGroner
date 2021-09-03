package curso.java.aula19;

import java.util.Scanner;

public class Exe011 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        System.out.println("Quantidade de vetore: "+vetorA.length);

        for (int i=0; i<vetorA.length; i++ ){
            System.out.println("insira o valor do vetor "+i+": " );
            vetorA[i] = scan.nextInt();

        }
        int qtdPares = 0;
        for (int i=0; i<vetorA.length; i++ ){
            if (vetorA[i] % 2 ==0){
                qtdPares++;
            }

        }
        System.out.println("Vetor A: ");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();

        System.out.println("Qtd numeros pares: "+qtdPares);
    }


}
