package curso.java.aula15;

import java.util.Scanner;

public class Exe008 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do pepino, tomate e batata: ");
        double pepino = scan.nextDouble();
        double tomate = scan.nextDouble();
        double batata = scan.nextDouble();

        if (pepino <= tomate & pepino <= batata) {
            System.out.println("você deve comprar o pepino está mais barato  " + pepino);
        } else if (tomate <= pepino & tomate <= batata) {
            System.out.println("você deve comprar o tomate está mais barato  " + tomate);
        } else if (batata <= pepino & batata <= tomate) {
            System.out.println("você deve comprar o batata está mais barato  " + batata);


        }
    }
}
