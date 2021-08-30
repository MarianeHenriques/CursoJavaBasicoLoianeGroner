package curso.java.aula13;

import java.util.Scanner;

public class Exe005 {

    public static void main(String[] args){

        Scanner metroCentimento = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int metros = metroCentimento.nextInt();
        int total = (metros * 100);
        System.out.println("O total de metros "+ metros+" .Tranformados em centimetros é "+total);

    }
}
