package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Isim, Soyisim;
        System.out.println("Isim?");
        Isim = scan.nextLine();
        System.out.println("Soyisim");
        Soyisim = scan.nextLine();
        System.out.println(Isim + " " + Soyisim);



    }


}
