package day04scannerwrapper;

import java.util.Scanner;
//5 basamaklı sayının ilk 2 ve son 2 basamağını toplayan kod
public class Scanner05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Sayi?");
        sayi = scan.nextInt();
        //% = modulus operator, solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir
        // bir tamsayıyı başkasına bölersek java tamsayı verir
        //ondalık kısmı iptal eder, tamsayı tamsayıya bölünürse birler basamağı silinir
        //son rakakmı al
        int sayiBirlerBasamagi = sayi%10;
        sayi = sayi/10;
        //sondan ikinciyi al
        int sayiOnlarBasamagi = sayi%10;
        sayi = sayi/10;
        //yüzler basamagi
        int sayiYuzlerBasamagi = sayi%10;
        sayi = sayi/10;
        int sayiBinlerBasamagi = sayi%10;
        sayi = sayi/10;
        int sayiOnbinlerBasamagi = sayi%10;

        System.out.println(+sayiBirlerBasamagi + sayiOnlarBasamagi +sayiBinlerBasamagi +sayiOnbinlerBasamagi);
    }
/*
Homework
1) Kullanıcıdan adliginiz 3 tane sayinin ortalamasını bulan kodu alınız
2) kullanicidan aldığınız 3 basamaklı bir sayının rakamları toplamını bulunuz
 */

}
