/*
Faça um programa que leia três valores de ponto flutuante: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo de base A e altura C.
b) a área do círculo de raio C. (pi = 3,14159)
c) a área do trapézio que tem A e B por base e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores duplos com um dígito após o ponto decimal.
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