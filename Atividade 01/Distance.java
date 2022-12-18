import java.util.Scanner;
/*
Dois carros (X e Y) partem na mesma direção. O carro X sai com velocidade constante de 60 km/h e o carro Y sai com velocidade constante de 90 km/h.

Em uma hora (60 minutos) o carro Y pode percorrer uma distância de 30 quilômetros do carro X, ou seja, pode se afastar um quilômetro a cada 2 minutos.

Leia a distância (em km) e calcule quanto tempo leva (em minutos) para o carro Y percorrer essa distância em relação ao outro carro.

Entrada
O arquivo de entrada contém 1 valor inteiro.
*/
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        int a = in.nextInt();

 

       System.out.printf(a*2+" minutos\n");


 
    }
 
}