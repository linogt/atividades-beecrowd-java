/*
https://www.beecrowd.com.br/judge/en/problems/view/1182
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    
    int l = in.nextInt();
    char v;
    v = in.next().charAt(0);
    double k = 0;
    double a[][] = new double[12][12];

    for(int i=0;i<12;i++){
      for(int j=0;j<12;j++){
        a[i][j] = in.nextDouble();
      }
    }

    for(int i=0;i<12;i++){
      k+=a[i][l];
    }
    
    if(v=='M'){
      k/=12;
    }
    
    System.out.printf("%.1f\n",k);
    in.close();
  }
}