package curso.java.aula17;

import java.util.Scanner;

public class Exe011 {


    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);


        int num1;
        int num2;
        int soma = 0;

        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();

        for (int i =num1; i<=num2; i++){
            soma += i ;
        }

        System.out.println(soma);

    }

}
