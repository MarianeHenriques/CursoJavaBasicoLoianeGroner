package curso.java.aula17;

import org.omg.CosNaming.BindingIterator;

import java.util.Scanner;

public class Exe007 {

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i=0; i<5; i++) {
            System.out.println("Entre com o numero:");
            num = scan.nextInt();

            // se o numero de entrada for maior substituir
            if (num > maior){
                maior = num;
                System.out.println("O maior numero mudou: "+maior);
            }
        }

        System.out.println("O maior numero digitado é: "+maior);

    }
}
