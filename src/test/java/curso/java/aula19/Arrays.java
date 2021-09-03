package curso.java.aula19;

public class Arrays {

    public static void main(String[] args){

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double TempDia005 = 33.1;


        // as couchletes são os arrays
        //boa pratica é declara o tipo de variavel e em seguida os arrays
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        //Declar um array expecifico
        System.out.println("A temperatura do dia 2 é: "+ temperaturas[1]);

        //Para saber o tamnanho total de espaço para todos os arrays
        System.out.println("O tamanho do arrays: "+ temperaturas.length);

        //se eu declara apenas o array ele vai aponta pro endereço de memoria
        System.out.println("Valores do arrays: "+ temperaturas);

        //Para obter todos os valores do array eu vou usar  loops
        for (int i=0;i < temperaturas.length; i++){
            System.out.println("A temperatura do dia "+ (i+1) +" é: "+ temperaturas[i]);
        }


    }
}
