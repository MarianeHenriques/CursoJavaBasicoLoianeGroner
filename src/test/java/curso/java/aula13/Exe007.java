package curso.java.aula13;

import java.util.Scanner;

public class Exe007 {

    public static void main(String[] args){

        //Leitura do teclado
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre como o tamanho do lado do quadrado");
        double lado = scan.nextDouble();

        //Area = ladao * lado
        double area = Math.pow(lado, 2);

        System.out.println("A area do quadrado é: "+ area);
        System.out.println("O dobro da area do quadrado é? "+(area * 2));
    }
}
