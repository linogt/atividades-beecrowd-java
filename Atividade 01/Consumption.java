/*
Calcule o consumo médio de um automóvel tendo em conta a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total (em Km) e o segundo é um número de ponto flutuante Y  representando o total de combustível gasto, com um dígito após o ponto decimal.
*/
import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        float b = in.nextFloat();
 

       System.out.printf("%.3f km/l\n",a/b);
 
    }
 
}