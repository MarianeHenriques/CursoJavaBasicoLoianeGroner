package curso.java.aula17;

import java.util.Scanner;

public class Exe003 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);

        boolean dadosValidos = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        //Nome + de 3 caracteres
        do {
            System.out.println("Digite seu nome: ");
           //Declarei em cima não peciso expecifica o tipo
            nome = scan.next();

            //length conta caracteres
            if (nome.length() > 3) {
                dadosValidos = true;
                System.out.println("Nome valido");
            } else {
                dadosValidos = false;
                System.out.println("Nome invalido, precisa ter mais que 3 caracteres");
            }
        } while (!dadosValidos);


        //Idade 0 a 150 anos
        do {
            System.out.println("\n Digite sua idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                dadosValidos = true;
                System.out.println("Sua idade é valida");
            } else {
                dadosValidos = false;
                System.out.println("Idade invalido, precisa ter de 0 a 150 anos");
            }
        } while (!dadosValidos);


        //Salario maior que zero
        do {
            System.out.println("\n Digite seu Salario: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                dadosValidos = true;
                System.out.println("Salario valido");
            } else {
                dadosValidos = false;
                System.out.println("Salario invalido, precisa declara uma salario maior que 0");
            }
        }while (!dadosValidos) ;



            //Sexo f ou v
        do {
            System.out.println("\n Digite seu Sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("m")) {
                dadosValidos = true;
                System.out.println("Sexo valido");
            }else if (sexo.equalsIgnoreCase("f")) {
                dadosValidos = true;
                System.out.println("Sexo valido");
            } else {
                dadosValidos = false;
                System.out.println("Sexo invalido, digite novamente F ou M");
            }
        } while (!dadosValidos);




            //Estado civil (s c v d)
        do {
            System.out.println("\n Digite seu estado civeil: S, C, V, D");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s")){
                dadosValidos = true;
                System.out.println("Estado civil valido");
            }else if (estadoCivil.equalsIgnoreCase("c")){
                dadosValidos = true;
                System.out.println("Estado civil valido");
            }else if (estadoCivil.equalsIgnoreCase("v")){
                dadosValidos = true;
                System.out.println("Estado civil valido");
            }else if (estadoCivil.equalsIgnoreCase("d")){
                dadosValidos = true;
                System.out.println("Estado civil valido");
            }else {
                dadosValidos = false;
                System.out.println("Estado civil invalido");
            }
        } while (!dadosValidos);


             System.out.println("\n As seguintes informações");
             System.out.println("Nome: "+ nome);
             System.out.println("Idade: "+ idade);
             System.out.println("Salário: "+salario);
             System.out.println("Sexo: "+sexo);
             System.out.println("Estado Civil: "+ estadoCivil);


    }

}
