package curso.java.aula15;

import java.util.Scanner;

public class Exe001 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numero na tela: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O numero " + num1+ " é maior que "+num2);
        }else if (num2 > num1){
            System.out.println("O numero "+ num2+ " é maior que "+ num1);
        }


    }
}
