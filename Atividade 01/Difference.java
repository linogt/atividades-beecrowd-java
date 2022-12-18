/*
Leia quatro valores inteiros denominados A, B, C e D. Calcule e imprima a diferença do produto A e B pelo produto de C e D (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      int D = in.nextInt();
      System.out.printf("DIFERENCA = " + (A * B - C * D) + "\n");
      
 
    }
 
}