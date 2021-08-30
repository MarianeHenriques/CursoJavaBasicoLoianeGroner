package curso.java.aula17;

import java.util.Scanner;

public class Exe005 {
    public static void main(String[] agrs){

        Scanner scan = new Scanner(System.in);

        boolean valido = false;

        double popA;
        double popB;
        double taxaA;
        double taxaB;

            valido = false;
        do {
            System.out.println("Entre com a população A: ");
            popA = scan.nextDouble();

            if (popA>0){
                valido = true;
            }else {
                System.out.println("digite um valor acima de 0");
            }
        }while (!valido);


        valido = false;
        do {
            System.out.println("Entre com a população A: ");
            popB = scan.nextDouble();

            if (popB>0){
                valido = true;
            }else {
                System.out.println("digite um valor acima de 0");
            }
        }while (!valido);



        valido = false;
        do {
            System.out.println("Entre com o crecismento população A: ");
            taxaA = scan.nextDouble();

            if (taxaA>0){
                valido = true;
            }else {
                System.out.println("digite um valor acima de 0");
            }
        }while (!valido);



        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento população B: ");
            taxaB = scan.nextDouble();

            if (taxaB>0){
                valido = true;
            }else {
                System.out.println("digite um valor acima de 0");
            }
        }while (!valido);



        int cont = 0;

        while ( popA < popB){
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;

        }

        System.out.println("População A: "+ popA);
        System.out.println("População B: "+ popB);
        System.out.println("Qnt de anos: "+cont);



    }
}
