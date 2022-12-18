/*
Read three point floating values (A, B and C) and verify if is possible to make a triangle with them. If it is possible, calculate the perimeter of the triangle and print the message:


Perimetro = XX.X


If it is not possible, calculate the area of the trapezium which basis A and B and C as height, and print the message:


Area = XX.X
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();    
        if ((A < B + C) && (B < A + C) && (C < B + A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}