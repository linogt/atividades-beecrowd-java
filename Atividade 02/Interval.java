/*https://www.beecrowd.com.br/judge/en/problems/view/1037
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);

    double a = in.nextDouble();

          if(0<=a&&a<=25)
            {System.out.println("Intervalo [0,25]");}
          else if(25<a&&a<=50)
            {System.out.println("Intervalo (25,50]");}
          else if(50<a&&a<=75)
            {System.out.println("Intervalo (50,75]");}
          else if (75<a&&a<=100)
            {System.out.println("Intervalo (75,100]");}
          else if(a < 0 || a > 100) 
           {System.out.println("Fora de intervalo");}
    in.close();
  }
}