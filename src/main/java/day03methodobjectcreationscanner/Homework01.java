package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     double sayi1, sayi2, sayi3, ortalama;
     int  sayi4,basamakToplami;
        System.out.println("sayi1?");
        sayi1= scan.nextDouble();
        System.out.println("sayi2?");
        sayi2= scan.nextDouble();
        System.out.println("Sayi3?");
        sayi3= scan.nextDouble();
        System.out.println("Sayi4?");
        sayi4= scan.nextInt();
        ortalama = (sayi1+sayi2+sayi3)/3;
        int birlerBasamagiSayi4 = sayi4%10;
        sayi4 = sayi4/10;
        int onlarBasamagiSayi4 = sayi4%10;
        sayi4= sayi4/10;
        int yuzlerBasamagiSayi4 =sayi4%10;
        basamakToplami =(birlerBasamagiSayi4+onlarBasamagiSayi4+yuzlerBasamagiSayi4);
        System.out.println("SayiBasamaktoplami = " + basamakToplami);
        System.out.println("Ortalama = " + ortalama);



    }


}
