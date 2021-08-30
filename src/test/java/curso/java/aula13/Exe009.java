package curso.java.aula13;

import java.util.Scanner;

public class Exe009 {

    public static void main(String[] args){

        //transforma Farenheit em graus celsius

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double fareinheit = scan.nextDouble();
        double celusius = (5* (fareinheit - 32) /9 );

        System.out.println(" o Valor da temperatura em graus celsius é: "+ celusius);

    }
}
