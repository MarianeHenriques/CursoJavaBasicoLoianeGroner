package curso.java.aula17;

import java.util.Scanner;

public class Exe009 {
    public static void main(String[] agrs){
       // Scanner scan = new Scanner(System.in);


        for (int i = 1; i< 50; i++){

            // imprimindo apenas numeros impares
           /* if (i % 2 != 0){
                System.out.println(i);
            }*/

            //imprimindo apenas numeros pares
           /* if (i % 2 == 0){
                System.out.println(i);
            }*/

            //imprimindo apenas mutiplos de 3
            if (i % 3 ==0){
                System.out.println(i);
            }
        }

    }
}
