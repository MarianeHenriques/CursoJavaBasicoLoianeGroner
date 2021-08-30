package curso.java.aula17;

import java.util.Scanner;

public class Exe004 {

    public static void main(String[] agrs){

      int paisA = 80000;
      int paisB = 200000;
      int cont = 0;

      while ( paisA < paisB){
          paisA += (paisA/100) * 3;
          paisB += (paisB/100) *1.5;
          cont++;

      }

        System.out.println("População A: "+ paisA);
        System.out.println("População B: "+ paisB);
        System.out.println("Qnt de anos: "+cont);
    }
}
