package day01variables;

import java.util.Scanner;

public class Tekrar01 {

    public static void main(String[] args) {
        /*Homework:3 farkli data typeda variable olusturup farkli satirlarda yazdirim ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        iki tamsayi turunde variable olusturup toplami
        */
        int not;
        Scanner scan = new Scanner(System.in);
        String Isim;
        System.out.println("ogrenci adi?");
        Isim=scan.nextLine();
        System.out.println("ogrenci notu?");
        not=scan.nextInt();
        if (not ==100 || not>= 80) {
            System.out.println(Isim +"'in notu = " + not+ " = A");
        }
        if (not < 80 || not > 60){
            System.out.println(Isim +"'in notu = " + not+ " = B");
        }
        if (not > 50){
            System.out.println(Isim + " = Gecer");
        }
        else if (not<0) {
            System.out.println("gecersiz");
        }
 //deneme
    }



}
