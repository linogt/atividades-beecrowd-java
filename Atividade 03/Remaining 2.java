/*
https://www.beecrowd.com.br/judge/en/problems/view/1075
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0;i<10000;i++){
      if(i%n==2){
        System.out.println(i);
      }
      
      
    }
    in.close();
  }
}