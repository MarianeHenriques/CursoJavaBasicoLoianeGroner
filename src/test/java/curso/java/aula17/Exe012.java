package curso.java.aula17;

import java.util.Scanner;

public class Exe012 {


    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com o numero: ");
        int num =  scan.nextInt();

        System.out.println("Taboada de "+num+ " :");

        for (int i= 1; i<= 10; i++){
            System.out.println(num+ " x " +i+ " = " +(num*i));
        }

    }

}
