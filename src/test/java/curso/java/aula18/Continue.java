package curso.java.aula18;

import java.util.Scanner;

public class Continue {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero: ");

        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        // Para parar o lupim

        for(int i=num; i <=max; i++){

            if (i % 7 == 0){
                if (i %7 == 0){
                    continue;
                }
            }

            System.out.println("O valor de é: "+i);
        }


    }
}
