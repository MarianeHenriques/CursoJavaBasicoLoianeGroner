package curso.java.aula15;

import java.util.Scanner;

public class Exe002 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero na tela ");
        int num1 = scan.nextInt();

        if (num1 >= 0){
            System.out.println("O numero digitado é POSITIVO");
        } else if (num1 < 0){
            System.out.println("O numero digitado é NEGATIVO");
        }

        // não há necessidade de colocar condição na segunda linha
        if (num1 >= 0){
            System.out.println("O numero digitado é POSITIVO");
        } else {
            System.out.println("O numero digitado é NEGATIVO");
        }


    }

    }
