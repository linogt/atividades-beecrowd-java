/*https://www.beecrowd.com.br/judge/en/problems/view/1038
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    double c = 0;
    if(a==1){
      c = 4*b;
    }
    if(a==2){
      c= 4.5*b;
    }
    if(a==3){
      c = 5*b;
    }
    if(a==4){
      c = 2*b;
    }
    if(a==5){
      c = 1.5*b;
    }
    System.out.printf("Total: R$ %.2f\n",c);
    in.close();

}}