/*
https://www.beecrowd.com.br/judge/en/problems/view/1014
*/
import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        float b = in.nextFloat();
 

       System.out.printf("%.3f km/l\n",a/b);
 
    }
 
}