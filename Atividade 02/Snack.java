/*
Using the following table, write a program that reads a code and the amount of an item. After, print the value to pay. This is a very simple program with the only intention of practice of selection commands.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    double c = 0;
    if(a==1){
      c = 4*b;
    }
    if(a==2){
      c= 4.5*b;
    }
    if(a==3){
      c = 5*b;
    }
    if(a==4){
      c = 2*b;
    }
    if(a==5){
      c = 1.5*b;
    }
    System.out.printf("Total: R$ %.2f\n",c);
    in.close();

}}