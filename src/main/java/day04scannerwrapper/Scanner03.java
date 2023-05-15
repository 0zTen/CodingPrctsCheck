package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Sayi1, Sayi2;
        System.out.println("Sayi1?");
        Sayi1 = scan.nextInt();
        System.out.println("Sayi2?");
        Sayi2 = scan.nextInt();
        System.out.println(Sayi1 + Sayi2);
        System.out.println(Sayi1 * Sayi2);
        System.out.println(Sayi1 - Sayi2);
        System.out.println(Sayi1 / Sayi2);
    }



}
