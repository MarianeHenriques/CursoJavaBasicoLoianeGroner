package curso.java.aula15;

import java.util.Scanner;

public class Exe005 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double totalNotas = (nota1 +nota2) /2;

        if (totalNotas == 10){
            System.out.println("Aprovado com distinção");
        }else if (totalNotas < 10 & totalNotas >= 7 ){
            System.out.println("Aprovado");
        }else if (totalNotas < 7){
            System.out.println("Reprovado");
        }


    }
}
