import java.util.Scanner;

public class VetorII {

    public static void main(String[] args){
        int t = new Scanner(System.in).nextInt();
        int n = 0, i = 0;

        while (n <= 999) {
            if( i < t) {  System.out.println("N[" +(n++)+ "] = "+  i++ );  }
            else i = 0 ;
        }
    }
}