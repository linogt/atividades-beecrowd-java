/*
Lê um valor inteiro correspondente à idade de uma pessoa (em dias) e imprime-o em anos, meses e dias, seguido da respectiva mensagem “ano(s)”, “mes(es)”, “dia(s)”.

Obs: só para facilitar o cálculo, considere o ano todo com 365 dias e 30 dias todos os meses. Nos casos de teste nunca haverá uma situação que permita 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com o objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém 1 valor inteiro.
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