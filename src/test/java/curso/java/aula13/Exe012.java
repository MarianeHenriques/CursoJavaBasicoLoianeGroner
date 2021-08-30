package curso.java.aula13;

import java.util.Scanner;

public class Exe012 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura: ");
        double altura = scan.nextDouble();

        double pesoideal = (72.7 * altura) -58;

        System.out.println("O Peso ideal é: "+ pesoideal);

    }

}
