/*
https://www.beecrowd.com.br/judge/en/problems/view/1174
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);

    for(int i=0;i<100;i++){
      double a = in.nextDouble();
      if(a<=10)
      {System.out.printf("A[%d] = %.1f\n",i,a);}
    }
    
    in.close();
  }
}