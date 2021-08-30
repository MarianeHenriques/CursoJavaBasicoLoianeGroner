package curso.java.aula13;

import java.util.Scanner;

public class Exe008 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da hora trabalhada: ");
        double valoHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salario = valoHora * horas;

        System.out.println("O salario é de: "+ salario);

    }

}
