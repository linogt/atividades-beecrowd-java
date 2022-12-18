/*
https://www.beecrowd.com.br/judge/en/problems/view/1072
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    double n = in.nextDouble();
    double k=0;
    double j=0;
    for(int i = 0;i<n;i++){
      double a = in.nextDouble();
      if(a>=10&&a<=20){
        k++;
      }
      else{
        j++;
      }
      a=0;
    }
    System.out.printf("%.0f in\n",k);
    System.out.printf("%.0f out\n",j);
    in.close();
  }
}