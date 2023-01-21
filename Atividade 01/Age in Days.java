/*
https://www.beecrowd.com.br/judge/en/problems/view/1020
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int ano = 0;
        int mes = 0;
        while(a-365>=0){
          a-=365;
          ano++;
        }
        while(a-30>=0){
          a-=30;
          mes++;
        }

 

       System.out.printf(ano+" ano(s)\n");
       System.out.printf(mes+" mes(es)\n");
       System.out.printf(a+" dia(s)\n");


 
    }
 
}