package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
      /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input starting number");
        int start = scan.nextInt();
        System.out.println("Input ending number");
        int ending = scan.nextInt();

        if (start > ending) {
            System.out.println("Start must be lower than ending");
        } else {
            for (int i = start; i <= ending; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    //ie2: hic sayi kullanmadan 1 den 100 e kadar olan tamsayilari consolea yazdirin

        for (int i = 'd'/'d';  i<='d' ; i++) {
            System.out.print(i+" ");
        }
    /*
       Note 1) Bazi looplar sonsuz defa calisabilir, bu tarz looplara inifinite (sonsuz) loop denir
       sonsuz loop genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir

        for (int i =1; i < 10; i--) {

        }

        Note 2) Loop olusturdugumuzda ikinci kismi yazmazsaniz sonsuz loop olusur
                for (int i = 0;  ; i++) {

        }

        Note 3) Bazi looplar hic calismayabilir

               for (int i = 1; i <0 ; i--) {

        }
         */
    }
}
