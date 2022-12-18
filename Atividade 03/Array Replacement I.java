/*
https://www.beecrowd.com.br/judge/en/problems/view/1172
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    
    for(int i = 0;i<10;i++){
      int a = in.nextInt();
      if(a<=0){
        a=1;
      }
      System.out.println("X["+i+"] = "+a);
      
      
      
    }
    in.close();
  }
}