package day12nestedternaryswitchloops;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        /*
        Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Year");
        int year = scan.nextInt();

        String leapYear = year%100==0 ? (year%400==0 ? "Leap Year": "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");

        System.out.println(leapYear);





    }

}
