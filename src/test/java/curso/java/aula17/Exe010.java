package curso.java.aula17;

import java.util.Scanner;

public class Exe010<num1, num2> {

    public static void main(String[] agrs){
             Scanner scan = new Scanner(System.in);

            int num1;
            int num2;


             System.out.println("Digite o primeiro numero: ");
             num1 = scan.nextInt();

             System.out.println("Digite o segundo numero: ");
             num2 = scan.nextInt();

             for (int i =num1; i<=num2; i++){
                 System.out.println(i);
             }




    }
}
