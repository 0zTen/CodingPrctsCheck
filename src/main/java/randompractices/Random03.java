package randompractices;

import java.util.Scanner;

public class Random03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input row count");
        int row= scan.nextInt();

        int i=1;
        while (i<=row){



           int j=1;
           while (j<=i){
               System.out.print(j+" ");

               j++;
           }
            System.out.println();
            i++;
        }

    }
}
