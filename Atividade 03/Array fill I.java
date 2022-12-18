/*
https://www.beecrowd.com.br/judge/en/problems/view/1173
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    
    for(int i = 0;i<10;i++){
      System.out.println("N["+i+"] = "+a);
      a*=2;
      
      
      
    }
    in.close();
  }
}