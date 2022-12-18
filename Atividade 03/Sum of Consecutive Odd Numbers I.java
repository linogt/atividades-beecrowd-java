/*
https://www.beecrowd.com.br/judge/en/problems/view/1071
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    double a = in.nextFloat();
    double b = in.nextFloat();
    double c = 0;
    if(b>a){
      c=b;
      b=a;
      a=c;
      c=0;
    }
    for(a--;a>b;a--){
      if(a%2!=0){
        c+=a;
      }
    }
    System.out.printf("%.0f\n",c);
      
    in.close();

}}