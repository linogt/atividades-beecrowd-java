/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas em um mês e o valor que ele recebe por hora. Imprima o número do funcionário e o salário que ele receberá no final do mês, com duas casas decimais.

Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
Não se esqueça do espaço antes e depois do sinal de igual e depois do U$.
Entrada
O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante, representando o número, o valor das horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.
*/
import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
      int A = in.nextInt();
      int B = in.nextInt();
      float C = in.nextFloat();
      System.out.printf("NUMBER = " + A + "\n");
      
      System.out.printf("SALARY = U$ %.2f\n", B*C);

 
    }
 
}