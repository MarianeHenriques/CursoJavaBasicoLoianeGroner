package curso.java.aula17;

public class LoopFor {

    public static void main(String[] args){

        for (int i = 0;i <= 8 ; i++ ){
            System.out.println("Valor de i: "+ i);
        }

        for (int i = 8; i >= 0; i--){
             System.out.println("Valor de i: "+ i);
        }

        for (int i = 1, j = 4;i < j ; i ++, j--){
            System.out.println("i = "+ i+ "; j = "+ j );
        }

        int count = 0;
        for(; count< 16;){
            System.out.println("valor de count: "+ count);
            count +=3;
        }

        for (int cont = 0; cont < 30;cont+=10){
            System.out.println("valor de cont: "+ cont);
        }




    }
}
