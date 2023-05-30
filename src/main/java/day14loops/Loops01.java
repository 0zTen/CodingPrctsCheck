package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //ie1: bir stringi ters ceviren kodu yaziniz
        String s = "Java";
        String rev= "";
        for (int i = s.length()-1; i>=0 ; i--) {
          rev = rev + s.substring(i,i+1);
        }
        System.out.println(rev);

        //2.yol
        String u= "Java";
        String revU= "";
        for (int i = u.length()-1; i>=0 ; i--) {
            revU= revU+u.charAt(i);
        }
        System.out.println(revU);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a String");
        String t = scan.nextLine();
        String revT= "";

        for (int i = t.length()-1; i>=0 ; i--) {
            revT = revT + t.charAt(i);
            }
        if (t.equalsIgnoreCase(revT)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }



    }
}
