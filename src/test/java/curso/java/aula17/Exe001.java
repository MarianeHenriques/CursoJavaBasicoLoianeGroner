package curso.java.aula17;

import java.util.Scanner;

public class Exe001 {


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        //declara a condição de falso
        boolean notaValida = false;

        //incluir o do while para repetir o processo
        //colaca a variavel dentro do do while
        do {
            System.out.println("Digite uma nota: ");
            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Sua nota é: "+nota);
            } else {

                notaValida = false;
                System.out.println("Digite outra nota: ");
            }

            //Preciso colocar a negação ! ou false
        }while (!notaValida);



    }
}
