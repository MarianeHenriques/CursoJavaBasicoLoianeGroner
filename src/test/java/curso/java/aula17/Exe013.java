package curso.java.aula17;

import java.util.Scanner;

public class Exe013 {


    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com a base:");
        int base= scan.nextInt();

        System.out.println("Entre com a potencia:");
        int pot= scan.nextInt();

        int resultado = base;

        for (int i=1; i<pot; i++){
            resultado *= base;
        }

        System.out.println("Resultado: "+resultado);

    }

}
