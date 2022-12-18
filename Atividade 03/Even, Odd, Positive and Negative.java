/*
https://www.beecrowd.com.br/judge/en/problems/view/1066
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    double par = 0;
    double impar = 0;
    double negativo = 0;
    double positivo = 0;
    for(int i = 0;i<5;i++){
      double a = in.nextDouble();
      if(a%2==0){
        par++;
      }
      else{
        impar++;
      }
      if(a!=0){
       if(a>0){
        positivo++;
       }
       else{

        negativo++;
       }
      }
      a=0;
    }
    System.out.printf("%.0f valor(es) par(es)\n",par);
    System.out.printf("%.0f valor(es) impar(es)\n",impar);
    System.out.printf("%.0f valor(es) positivo(s)\n",positivo);
    System.out.printf("%.0f valor(es) negativo(s)\n",negativo);
    in.close();
  }
}