package curso.java.aula17;

import java.util.Scanner;

public class Exe002 {

    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);

        boolean senhaCorreta = false;

        do {
            System.out.println("Digite seu nome de usario: ");
            String nomeUsuario = scan.next();

            System.out.println("Digite sua senha: ");
            String senha = scan.next();

            //Estou passando string dentro do parametro
            if (nomeUsuario.equalsIgnoreCase(senha)){
                senhaCorreta = false;
                System.out.println("Senha incorreta, digite novamente: ");
            }else {
                senhaCorreta = true;
                System.out.println("Senha correta");
            }

        }while (!senhaCorreta);


        }

    }




