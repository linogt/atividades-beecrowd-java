/*
https://www.beecrowd.com.br/judge/en/problems/view/1073
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 2;i<=n;i+=2){
      int c = i*i;
      System.out.println(i+"^2 = "+c);
      
    }
    in.close();
  }
}