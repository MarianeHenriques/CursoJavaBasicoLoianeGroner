package curso.java.aula15;

import java.util.Scanner;

public class Exe012 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor/hora");
        double valoHora = scan.nextDouble();

        System.out.println("Entre com horas trabalhada no mes ");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valoHora * qtdHoras;

        int percentualIR = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;
        }else if (salarioBruto > 900 && salarioBruto <= 1500 ){
            percentualIR = 5;
        }else if (salarioBruto > 1500 && salarioBruto <= 2500 ){
            percentualIR = 10;
        }else if (salarioBruto > 2500  ){
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDesconto = ir + inss;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salario Bruto: ("+ valoHora+" * "+ qtdHoras+"):"+salarioBruto);
        System.out.println("(-) IR ("+ percentualIR+ "%):"+ir );
        System.out.println("(-) INSS (10%): "+inss);
        System.out.println("FGTS (11%): "+ fgts);
        System.out.println("Total de descontos: "+ totalDesconto);
        System.out.println("Salario Liquido: "+ salarioLiquido);
    }

}
