/*https://www.beecrowd.com.br/judge/en/problems/view/1044
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = 1;
    if(a<=b){
      c = b%a;
    }
    else{
      c = a%b;
    }

    if(c==0){
      System.out.printf("Sao Multiplos\n");
    }
    else{
      System.out.printf("Nao sao Multiplos\n");
    }
    in.close();

}}