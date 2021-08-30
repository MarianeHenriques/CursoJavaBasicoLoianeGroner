package curso.java.aula13;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OperadoresAritimeticos {

    public static void main(String[] args){

        //soma
        int resultado = 1+2;
        System.out.println(resultado);

        //resultado da soma acima -1
        resultado = resultado - 1;
        System.out.println(resultado);

        //resultado vezes 2
        resultado = resultado * 2;
        System.out.println(resultado);

        //resultado divido por 2
        resultado = resultado / 2;
        System.out.println(resultado);

        //resultado mais 8
        resultado = resultado + 8;
        System.out.println(resultado);

        //resultado divido por 7 quero o resto
        resultado = resultado % 7;
        System.out.println(resultado);

        //Junçaõ de letras
        String primeiroNome  = "Esta é ";
        String segundoNome = "uma concatenação.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

    }
}
