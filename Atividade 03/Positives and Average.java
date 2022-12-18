/*
https://www.beecrowd.com.br/judge/en/problems/view/1064
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    double b = 0;
    double c = 0;
    for(int i = 0;i<6;i++){
      double a = in.nextDouble();
      if(a>0){
        b++;
        c+=a;
      }
      a=0;
    }
    System.out.printf("%.0f valores positivos\n",b);
    System.out.printf("%.1f\n",c/b);
    in.close();
  }
}