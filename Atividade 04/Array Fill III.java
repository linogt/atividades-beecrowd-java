/*
https://www.beecrowd.com.br/judge/en/problems/view/1178
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
    for(int i = 0;i<100;i++){
      System.out.printf("N[%d] = %.4f\n",i,a);
      a/=2;
    }
    in.close();
  }
}