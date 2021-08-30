package curso.java.aula12;

import java.util.Scanner;

public class LeituraDadosDoTeclado {

    public static void main(String[] args){

        //Criando a variavel para leitura do teclado
        Scanner ler = new Scanner(System.in);

        //para ler tudo que digitar
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = ler.nextLine();
        System.out.println("Seu nome completo é: "+ nomeCompleto);

        //para ler apenas o primeiro nome
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = ler.next();
        System.out.println("O seu primeiro nome é "+ primeiroNome);

        //para ler um numero
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Sua idade é: "+ idade);

        //para digitar numero com virgula
        System.out.println("Digite seu peso: ");
        double peso = ler.nextDouble();
        System.out.println("O seu peso é: ");

        //para preencher varios dados
        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se possui animal");
        String primeiroNome1 = ler.next();
        int idade1 = ler.nextInt();
        int filhos = ler.nextInt();
        double altura1 = ler.nextDouble();
        boolean animal = ler.nextBoolean();

        System.out.println("nome: "+ primeiroNome1);
        System.out.println("idade "+idade1);
        System.out.println("filhos"+filhos);
        System.out.println("animal"+animal);



    }
}
