package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
      /*
        Example 1: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5               */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input row count");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
