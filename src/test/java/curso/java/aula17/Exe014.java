package curso.java.aula17;

import java.util.Scanner;

public class Exe014 {


    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int num1;
        int pares = 0;
        int impares = 0;

        for (int i=0; i<10; i++) {

            System.out.println("digite o  numero:");
            num1 = scan.nextInt();

            if (num1 % 2 == 0){
                pares ++;
            }else {
                impares ++;
            }

            System.out.println("Pares: "+pares);
            System.out.println("impares: "+ impares);

        }

    }

}
