package curso.java.aula17;

import java.util.Scanner;

public class Exe008 {

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        double media;


        for(int i =0; i< 5; i++){

            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            soma +=num;
        }

        media = soma/ 5;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
    }
}
