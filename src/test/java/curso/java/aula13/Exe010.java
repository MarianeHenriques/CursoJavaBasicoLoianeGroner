package curso.java.aula13;

import java.util.Scanner;

public class Exe010 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("digite a temperatura em graus celsius: ");
       double c = scan.nextDouble();
       double f =c * 1.8 + 32;

        System.out.println("a temperaturam em faherent: "+ f);
    }
}
