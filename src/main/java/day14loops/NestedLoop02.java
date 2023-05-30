package day14loops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
        /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Input row count");
        int row= scan.nextInt();
        System.out.println("Input column count");
        int column= scan.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
