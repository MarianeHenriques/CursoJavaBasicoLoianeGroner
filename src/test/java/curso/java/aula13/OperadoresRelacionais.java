package curso.java.aula13;

import javax.jws.soap.SOAPBinding;

public class OperadoresRelacionais {

    public static void main(String[] args){

        int valor1 = 1;
        int valor2 = 2;

        //igual ==
        System.out.println("valor1 igual valor2: "+(valor1 == valor2));

        // diferente de !=
        System.out.println("Valor diferente valor2: "+(valor1 != valor2));

        //maior que >
        System.out.println("valor1 maior que valor2: "+(valor1 > valor2));

        //maior ou igual >=
        System.out.println("valor1 maior ou igual valor2: "+(valor1 >= valor2));

        //menor que <
        System.out.println("valor1 menor que valor2: "+(valor1 < valor2));

        //menor ou igual <=
        System.out.println("valor1 igual valor2: "+(valor1 <= valor2));

    }
}
