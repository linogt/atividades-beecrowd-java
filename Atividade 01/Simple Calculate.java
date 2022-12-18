import java.util.Scanner;
/*
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.
*/
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner in = new Scanner(System.in);
       float n4 = 0;
      for(int i=0;i<2;i++){
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        float n3 = in.nextFloat();
        n4 += n2*n3;
      }
      System.out.printf("VALOR A PAGAR: R$ %.2f\n", n4);

 
    }
 
}