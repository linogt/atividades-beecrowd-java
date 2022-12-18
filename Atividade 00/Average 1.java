/*
https://www.beecrowd.com.br/judge/en/problems/view/1005
*/
import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
      float n1 = in.nextFloat();
      float n2 = in.nextFloat();
      System.out.printf("MEDIA = %.5f\n",((n1*3.5+n2*7.5)/11));

 
    }
 
}