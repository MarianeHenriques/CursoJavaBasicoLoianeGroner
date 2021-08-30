package curso.java.aula13;

import java.util.Scanner;

public class SalarioMariane {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario: ");
        double salario = scan.nextDouble();
        double porHora = salario / 220;
        System.out.println(" O valor da sua hora trabalhada é: "+ porHora);

    }
}
