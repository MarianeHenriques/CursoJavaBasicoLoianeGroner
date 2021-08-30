package curso.java.aula13;

import java.util.Scanner;

public class Exe013 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da hora trabalhada: ");
        double valoHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double valorBruto = valoHora * horas;
        double inss = (valorBruto / 100) * 14;
        double sindicato = (valorBruto / 100) * 5;
        double ir = (valorBruto / 100) *11;
        double totalDesconto = inss + ir ;
        double descontoINSS = valorBruto - inss;

        double salarioLiquido = valorBruto - totalDesconto;

        System.out.println("O salario  bruto é de: " + valorBruto);
        System.out.println("O INSS é: " + inss);
        System.out.println("O Sindicato é: " + sindicato);
        System.out.println("O IR é: " + ir);
        System.out.println("O Salario liquido é: " + salarioLiquido);
        System.out.println("O valor é: "+ descontoINSS);


    }


}
