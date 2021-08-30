package curso.java.aula13;

import java.util.Scanner;

public class Exe004 {

    public  static void main(String[] args){

        Scanner media = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = media.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = media.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = media.nextDouble();
        System.out.println("Quarta nota: ");
        double nota4 = media.nextDouble();
        System.out.println("O valor da media é "+ (nota1+nota2+nota3+nota4)/4);
    }
}
