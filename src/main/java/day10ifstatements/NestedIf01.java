package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
/*
      Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input lenght for sides");
        double sideA = Math.abs(scan.nextDouble());
        double sideB = Math.abs(scan.nextDouble());
        double sideC = Math.abs(scan.nextDouble());

        boolean IsTriangle = sideA + sideB > sideC && sideC > Math.abs(sideA - sideB) &&
                             sideA + sideC > sideB && sideB > Math.abs(sideA - sideC) &&
                             sideB + sideC > sideA && sideA > Math.abs(sideB - sideC);

        if (IsTriangle) {

            if (sideA==sideB && sideB== sideC && sideA==sideC){
                System.out.println("Equilateral Triangle");
            }else{
                System.out.println("Triangle");
            }

        }else{
            System.out.println("It is not a triangle");
        }


    }
}
