package curso.java.aula15;

import java.util.Scanner;

public class Exe011 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scan.nextDouble();

        int percentual= 0;

        // Percentual de aumento
        if (salario < 208){
            percentual = 20;
        }else if (salario >= 280 && salario < 700){
            percentual =15;
        }else if (salario >= 700 && salario < 1500){
            percentual =10;
        }else if (salario >= 1500 ){
            percentual =5;
        }

        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salario: "+ salario);
        System.out.println("Percentual: "+ percentual);
        System.out.println("Aumento: "+aumento);
        System.out.println("Salario Ajustado: "+ salarioAjustado);



    }

}
