package day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String non primitive data type ve classtır

        String s = "Java is easy";


        //Ornek1: "s" Stringindeki tüm karakterleri buyuk harf yapınız

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        String sLower = s.toLowerCase();
        System.out.println("sLower = " + sLower);
        //ie.3: "s" stringindeki ilk karakteri alınız.

        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar);

        //ie4: s stringindeki 2. ve sondan ikinci karakteri alın

        char secondChar =s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);
        //ie5: s stringindeki karakter sayısını bulunuz
        int sLength =s.length();
        System.out.println("length = " + sLength);
        //ie6: s stringindeki ilk 4 karakteri alınız
        String sfirstFourChar = s.substring(0, 4);
        System.out.println("sfirstFourChar = " + sfirstFourChar);
        //bu kullanımda ilk index dahil, ikinci index harictir.
        //ie7: s stringindeki is kelimesini alınız
        String ie7s =s.substring(5,7);
        System.out.println("ie7s = " + ie7s);
        String ie8s= s.substring(8,12);
        System.out.println("ie8s = " + ie8s);
        //ikinci yol
        String ikinciYolS= s.substring(8);
        System.out.println("ikinciYolS = " + ikinciYolS);
        //ie9: s stringinde "money kelimesinin var olup olmadığını kontrol ediniz
        boolean isExist= s.contains("Money");
        System.out.println("isexist = " + isExist);
        //ie10: s stringinde belli bir harfle başlayıp başlamadığını kontrol ediniz
        boolean isStartsWith = s.startsWith("J");
        System.out.println("isStartsWith = " + isStartsWith);
        boolean isStartsWith2 = s.startsWith("i",5);
        System.out.println("isStartsWith2 = " + isStartsWith2);
        boolean isStartsWith3 = s.startsWith("v",2);
        System.out.println("isStartsWith3 = " + isStartsWith3);
    }


}
