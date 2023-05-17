package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
            /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Gender");
        String gender = scan.nextLine();
        System.out.println("Input Age");
        byte age = scan.nextByte();
        if (age<0 || age>120) {
            System.out.println("Please input age between 0 and 120");
        } else if (gender.equalsIgnoreCase("Woman")) {
            if (age >= 60) {
                System.out.println("Can Retire");
            } else {
                System.out.println("Cannot Retire");
            }

        } else if (gender.equalsIgnoreCase("Man")) {
            if (age >= 65) {
                System.out.println("Can Retire");
            } else {
                System.out.println("Cannot Retire");
            }

        } else {
            System.out.println("Unidentified Data");
        }

    }
}
