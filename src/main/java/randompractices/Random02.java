package randompractices;

import java.util.Scanner;

public class Random02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input row count");
        int row= scan.nextInt();
        System.out.println("Input column count");
        int column= scan.nextInt();

        int i=1;
        while(i<=row){
            i++;
          int j=1;
          while(j<=column){
              System.out.print("x ");

              j++;
          }
            System.out.println();
        }


    }
}
