package curso.java.aula13;

import java.util.Scanner;

public class Apartamento {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Apartamento: ");
        double valorTolal = scan.nextDouble();
        System.out.println("Digite o Valor do financiamento: ");
        double valorFinaciamento = scan.nextDouble();
        double entrada = valorTolal - valorFinaciamento;

        System.out.println("valor da entrada é: " + entrada);



    }
}
