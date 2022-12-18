/*Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and if the sum of C and D is greater than the sum of A and B and if C and D were positives values and if A is even, write the message “Valores aceitos” (Accepted values). Otherwise, write the message “Valores nao aceitos” (Values not accepted).*/

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