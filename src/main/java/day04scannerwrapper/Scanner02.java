package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Adres?");
        String adres = scan.nextLine();
        System.out.printf(adres);


    }
}
