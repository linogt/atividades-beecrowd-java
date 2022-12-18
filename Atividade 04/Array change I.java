/*
https://www.beecrowd.com.br/judge/en/problems/view/1175
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int a[] = new int[20];
    
    for(int i = 19;i>-1;i--){
      a[i]= in.nextInt();
    }
    for(int i = 0;i<20;i++){
      System.out.println("N["+i+"] = "+a[i]);
    }
    in.close();
  }
}