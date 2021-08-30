package curso.java.aula15;

import java.util.Scanner;

public class Exe009 {

        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite três numero na tela: ");
            int nume1 = scan.nextInt();
            int nume2 = scan.nextInt();
            int nume3 = scan.nextInt();

            if (nume1 <= nume2 && nume1 <= nume3 && nume2 <= nume3){
                //num1 é menor
                //num3 é maior
                //num1 < num2 < num3
                System.out.println(nume3+ " - "+ nume2+ " - "+ nume1);
            } else if (nume1 <= nume2 && nume1 <= nume2 && nume3 <= nume2){
                //num1 é menor
                //num2 é maior
                //num1 < num3 < num2
                System.out.println(nume2+ " - "+ nume3+ " - "+ nume1);
            } else if (nume2 <= nume1 && nume2 <= nume3 && nume1 <= nume3){
                //num2 é menor
                //num3 é maior
                //num2 < num1 < num3
                System.out.println(nume3+ " - "+ nume1+ " - "+ nume2);
             } else if (nume2 <= nume1 && nume2 <= nume3 && nume3 <= nume1){
                //num2 é menor
                //num1 é maior
                // num2 < num3 < num1
                System.out.println(nume1+ " - "+ nume3+ " - "+ nume2);
            } else if (nume3 <= nume1 && nume3 <= nume2 && nume1 <= nume2){
                //num3 é menor
                //num2 é maior
                // num3 < num1 < num2
                System.out.println(nume2+ " - "+ nume1+ " - "+ nume3);
            }else if (nume3 <= nume1 && nume3 <= nume3 && nume2 <= nume1){
                //num3 é menor
                //num1 é maior
                // num3 < num2 < num1
                System.out.println(nume1+ " - "+ nume2+ " - "+ nume3);
            }
        }






        }



