/*
https://www.beecrowd.com.br/judge/en/problems/view/1008
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