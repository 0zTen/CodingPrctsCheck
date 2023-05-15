package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazdiran
        // kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz
        Scanner scan= new Scanner(System.in);
        System.out.println("Input a character");
        char ch= scan.next().charAt(0);

        //1.yol
        if (ch>'A' && ch<='Z'){
            System.out.println("Upper Case");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }

        //2.Yol
        if (ch>'A' && ch<='Z') {
            System.out.println("Upper Case");
        } else if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Not a character");
        }












    }













}
