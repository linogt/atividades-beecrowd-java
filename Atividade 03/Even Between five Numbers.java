/*
https://www.beecrowd.com.br/judge/en/problems/view/1065
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    double b = 0;
    double c = 0;
    for(int i = 0;i<5;i++){
      double a = in.nextDouble();
      if(a%2==0){
        b++;
      }
      a=0;
    }
    System.out.printf("%.0f valores pares\n",b);
    in.close();
  }
}