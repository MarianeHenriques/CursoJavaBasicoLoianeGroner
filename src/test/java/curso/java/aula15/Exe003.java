package curso.java.aula15;

import java.util.Scanner;

public class Exe003 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um sexo ( F ou M) ");
        String sexo = scan.next();

        switch (sexo){
            case "M":
            case "m": System.out.println("Masculino"); break;
            case "f":
            case "F": System.out.println("Feminino");break;
            default: System.out.println(" Sexo invalido. digite F ou V");
        }

        // para passar uma String é necessário declarar assim IngnoreCase ser para declara que tanto faz a letra ser maiuscula ou minuscula
        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - sexo feminino ");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - sexo masculino ");
        }else {
            System.out.println("Sexo invalido");
        }

    }
}
