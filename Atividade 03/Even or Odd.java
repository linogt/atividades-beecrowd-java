/*
https://www.beecrowd.com.br/judge/en/problems/view/1074
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0;i<n;i++){
      int a = in.nextInt();
      if(a!=0){
       if(a%2==0){
         System.out.printf("EVEN ");
       }
       else{
         System.out.printf("ODD ");
       }
       if(a>0){
        System.out.println("POSITIVE");
       }
       else{
        System.out.println("NEGATIVE");
       }
      }
      else{
        System.out.println("NULL");
      }

    }
    in.close();
  }
}