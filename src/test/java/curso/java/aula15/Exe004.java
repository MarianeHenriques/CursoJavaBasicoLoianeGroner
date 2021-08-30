package curso.java.aula15;

import java.util.Scanner;

public class Exe004 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();
        String vogais = "a e i o u";


        // uma forma de colocar no if
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
        || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Essa letra é uma vogal");
        }else {
            System.out.println("uma consoante");
        }

        // uma forma de usar swithcase

        switch (letra){
            case "a:":
            case "e" :
            case "i":
            case "o":
            case "u":
            case "A:":
            case "E" :
            case "I":
            case "O":
            case "U": System.out.println("Vogal"); break;
            default: System.out.println("Consoante");



        }



    }


}
