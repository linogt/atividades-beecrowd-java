import java.util.Scanner;
/*https://www.beecrowd.com.br/judge/en/problems/view/1010
*/
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
       float n4 = 0;
      for(int i=0;i<2;i++){
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        float n3 = in.nextFloat();
        n4 += n2*n3;
      }
      System.out.printf("VALOR A PAGAR: R$ %.2f\n", n4);

 
    }
 
}