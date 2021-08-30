package curso.java.aula16;

public class LoopWhile {


    public static void main(String[] args){

        int i = 1;
        int max = 10;

        System.out.println("Contando até "+ max);

        //While vai refazer esse codigo até chegar no limite que eu estabeleci

        //ler primeiro a expressão depois execulta
        while (i <= max){
            System.out.println("Valor de i: "+ i);
            i++; // i = i + 1; ou i += 1
        }

        System.out.println(i);// valor de 11

        //Execulta primeiro e depois analisa a regra
        do {
            i++;
            System.out.println("Valor de i: "+ i);
        }while (i < 15);


    }

}
