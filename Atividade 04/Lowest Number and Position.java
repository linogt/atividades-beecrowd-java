/*
https://www.beecrowd.com.br/judge/en/problems/view/1180
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int cont = 0;
    int b = in.nextInt();
    int menor=b;
    int auxcont = 0;
    
    for(int i = 0;i<a-1;i++){
      b = in.nextInt();
      cont++;
      if (b<menor){
        menor=b;
        auxcont = cont;
      }
    }
	
    System.out.printf("Menor valor: %d\n",menor);
    System.out.printf("Posicao: %d\n",auxcont);
    in.close();
  }
}