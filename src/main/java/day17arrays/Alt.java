package day17arrays;

import java.util.Scanner;

public class Alt {
    public static void main(String[] args) {
        //ie: kullanicinin coklu datayi bir arraye yerlestirebilmesi, istedigi zaman durdurabilmesi icin gereken kod
        Scanner scan = new Scanner(System.in);
        /*
        1)Kullanicidan data almak icin scanner
        2)Coklu data yerlestirmek icin bir array olustur
        3)Array olusturmak icin kullanicidan array kac elemanli olacagini al
        4)loop olusturup eleman ekleme islemini tekrarli yap
         */
        System.out.println("Please Input How Many Elements You Would Want To See");
        int numOfElements = scan.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("For stopping sequence, please press 'q'");

        for (int i = 0; i < stdNames.length; i++) {
            if (i == 1) {
                System.out.println("Input " + (i+1) + " st Element Name");
                String name = scan.next();
            } else if (i == 2) {
                System.out.println("Input " + (i+1) + " nd Element Name");
                String name = scan.next();
            } else if (i == 3) {
                System.out.println("Input " + (i+1) + " rd Element Name");
                String name = scan.next();
            }else if (i > 3) {
                System.out.println("Input " + (i+1) + "th Element Name");
                String name=scan.next();
            }


        }

    }
}
