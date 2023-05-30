package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number for times table");
        int num = scan.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;

        }
        System.out.println();
        //verilen 1 stringde her harfin sonuna "*" sembolunu ekleyiniz
        // Java==> J*a*v*a
        System.out.println("Input a word");
        String t = scan.next();
        String newWord = "";

        int k = 0;
        while (k < t.length()) {
            newWord = newWord + t.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);

        //ie3: bir Stringdeki tekrarsiz karakterleri konsolla yazdiriniz
        //kertenkelle
        String r = "kertenkelle";
        String sum = "";
        int j = 0;
        while (j < r.length()) {

            char ch = r.charAt(j);

            if (r.indexOf(ch)==r.lastIndexOf(ch)){
                sum=sum+ch;
            }

            j++;
        }
        System.out.println(sum);

    }
}
