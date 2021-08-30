package curso.java.aula15;

import java.util.Scanner;

public class Exe014 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 1");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 1");
        int lado3 = scan.nextInt();


            //A soma de dois lado é igaul a o terceiro
            if (((lado1 + lado2) > lado3) &&
                    ((lado1 + lado3) > lado2) &&
                    ((lado2 + lado3) > lado1)) {

            //Todos os lados são iguais
            }else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triangulo Equilatero");

            //Todos os lados são diferentes
            }else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("Triangulo Escaleno");

            // O valor de dois lados são equivalentes
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triangulo Isocelis");

                //caso não atenda nenhum desses requisitos não é um triangulo
            }else {
                System.out.println("não forma um triangulo");
            }



    }
}
