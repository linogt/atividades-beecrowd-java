/*
https://www.beecrowd.com.br/judge/en/problems/view/1012
*/
import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);


        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
 

       System.out.printf("TRIANGULO: %.3f\n",((a*c)/2));
       System.out.printf("CIRCULO: %.3f\n",(3.14159*Math.pow(c,2)));
       System.out.printf("TRAPEZIO: %.3f\n",(((a+b)/2)*c));
       System.out.printf("QUADRADO: %.3f\n",b*b);
       System.out.printf("RETANGULO: %.3f\n",a*b);

 
    }
 
}