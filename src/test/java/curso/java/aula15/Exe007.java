package curso.java.aula15;

import java.util.Scanner;

public class Exe007 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três numero na tela: ");
        int nume1 = scan.nextInt();
        int nume2 = scan.nextInt();
        int nume3 = scan.nextInt();

        //Maior numero
        if (nume1 >= nume2 & nume1 >= nume3) {
            System.out.println("O numero " + nume1 + " é maior que " + nume2 + " e " + nume3);
        } else if (nume2 >= nume1 & nume2 >= nume3) {
            System.out.println("O numero " + nume2 + " é maior que " + nume1 + " e " + nume3);
        } else if (nume3 >= nume2 & nume3 >= nume1) {
            System.out.println("O numero " + nume3 + " é maior que " + nume2 + " e " + nume1);
        }

        //Menor numero
        if (nume1 <= nume2 & nume1 <= nume3) {
            System.out.println("O numero " + nume1 + " é menor que " + nume2 + " e " + nume3);
        } else if (nume2 <= nume1 & nume2 <= nume3) {
            System.out.println("O numero " + nume2 + " é menor que " + nume1 + " e " + nume3);
        } else if ( nume3 <= nume2 & nume3 <= nume1 ) {
            System.out.println("O numero " + nume3 + " é menor que " + nume2 + " e " + nume1);
        }else {
            System.out.println("Todos os numero digitados possui o mesmo valor");
        }


    }



}