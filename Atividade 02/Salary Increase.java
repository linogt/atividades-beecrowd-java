/*
https://www.beecrowd.com.br/judge/en/problems/view/1048
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);

    double a = in.nextDouble();
    double b = 0;
    int c = 0;

          if(0<=a&&a<=400){
            b=a*0.15;
            c=15;
          }
          else if(400<a&&a<=500){
            b=a*0.12;
            c=12;
          }
          
          else if(800<a&&a<=1200){
            b=a*0.10;
            c=10;
          }
          else if (1200<a&&a<=2000){
            b=a*0.07;
            c=7;
          }
          else if(2000<a){
            b=a*0.04;
            c=4;
          }
    System.out.printf("Novo salario: %.2f\n",a+b);
    System.out.printf("Reajuste ganho: %.2f\n",b);
    System.out.printf("Em percentual: "+c+" %%\n");
    in.close();
  }
}