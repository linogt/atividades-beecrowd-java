/*
https://www.beecrowd.com.br/judge/en/problems/view/1007
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