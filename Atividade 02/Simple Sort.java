/*https://www.beecrowd.com.br/judge/en/problems/view/1042
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int auxa= 0;
    int auxb= 0;
    int auxc= 0;
    
    if(a>=b&&b>=c){
      auxa=a;
      auxb=b;
      auxc=c;
      
      
    }
    if(a>=c&&c>=b){
      auxa=a;
      auxb=c;
      auxc=b;

    }
    if(b>=a&&a>=c){
      auxa=b;
      auxb=a;
      auxc=c;
      
    }
    if(b>=c&&c>=a){
      auxa=b;
      auxb=c;
      auxc=a;
      
    }
    if(c>=a&&a>=b){
      auxa=c;
      auxb=a;
      auxc=b;
      
    }
    if(c>=b&&b>=a){
      auxa=c;
      auxb=b;
      auxc=a;
      
    }
    
    System.out.printf(auxc + "\n" + auxb + "\n" + auxa + "\n");
    System.out.printf("\n" + a + "\n" + b + "\n" + c + "\n");
    in.close();

}}
