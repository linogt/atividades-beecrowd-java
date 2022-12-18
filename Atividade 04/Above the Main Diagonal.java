/*
https://www.beecrowd.com.br/judge/en/problems/view/1183
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{

    Scanner in = new Scanner(System.in);
    
    char v;
    v = in.next().charAt(0);
    double k = 0;
    double a[][] = new double[12][12];
    int h =1;

    for(int i=0;i<12;i++){
      for(int j=0;j<12;j++){
        a[i][j] = in.nextDouble();
        if(h<=j){
          k+=a[i][j];
        }
      }

      h++;
    }
    
    if(v=='M'){
      k/=66;
    }
    
    System.out.printf("%.1f\n",k);
    in.close();
  }
}
