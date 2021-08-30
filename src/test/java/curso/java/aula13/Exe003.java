package curso.java.aula13;

import java.util.Scanner;

public class Exe003 {

    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o Primeiro numero: ");
        int numero2 = leitura.nextInt();
        System.out.println("Digite o proximos numero: ");
        int numero3 = leitura.nextInt();
        System.out.println("O valor de "+ numero2 +" somado ao valor de "+ numero3 +" é igaul há "+(numero2+numero3));

    }
}
