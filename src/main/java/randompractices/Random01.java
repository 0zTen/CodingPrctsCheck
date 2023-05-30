package randompractices;

import java.util.Locale;
import java.util.Scanner;

public class Random01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String");
        String s = scan.nextLine();
        String revS = "";
        for (int i = s.length()-1; i>=0 ; i--) {
           revS= revS+ s.substring(i,i+1);
        }
        System.out.println(revS);
    }

}
