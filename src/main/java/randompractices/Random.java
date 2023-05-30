package randompractices;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input a String");
        String t = scan.nextLine();
        String revT= "";
        for (int i = t.length()-1; i>=0 ; i--) {
            revT= revT+ t.charAt(i);
        }
        System.out.println(revT);
    }
}
