/*https://www.beecrowd.com.br/judge/en/problems/view/1035*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(b>c&&d>a&&c+d>a+b&&c>0&&d>0&&a%2==0){
          System.out.printf("Valores aceitos\n");
        }
        else{
         System.out.printf("Valores nao aceitos\n");
        }
      in.close();
    }
 
}