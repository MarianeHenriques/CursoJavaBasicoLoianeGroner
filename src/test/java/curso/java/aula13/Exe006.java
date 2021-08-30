package curso.java.aula13;

import java.util.Scanner;

public class Exe006 {

    public static void main(String[] args){

        //Calculando area do circulo

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo; ");
        double raio= scan.nextDouble();

        //Math é um comando para operações matematicas pow é elevado ao 2
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("O valor do raio é: "+ area);
    }

}
