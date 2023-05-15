package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //ie.1: stringin money ile bitip bitmediğini kontrol ediniz
        boolean isEndsWith = s.endsWith("money");
        System.out.println("isEndsWith = " + isEndsWith);
        String replaceS = s.replace("money","dollar");
        System.out.println("replaceS = " + replaceS);
        String replaceS2= s.replace("earn", "win");
        System.out.println("replaceS2 = " + replaceS2);
        //ie4: s stringindeki tüm a ları yıldız yap
        String replaceS3= s.replace('a','*');
        System.out.println("replaceS3 = " + replaceS3);
        //ie5: s stringindeki tüm n harflerini xxx yapın
        String replaceS4 = s.replace("n","xxx");
        System.out.println("replaceS4 = " + replaceS4);
        //ie6: s stringindeki e harflerini silin
        String replaceS5= s.replace("e","");
        System.out.println("replaceS5 = " + replaceS5);

        String t= "Ali 13 yasindadir!...";
        //ie7: t stringindeki tüm rakamlari yıldıza cevirin
        /*
        Not: Regex : bir grup datayı ifade etmek için regular expressions(Regex) kullanılır
        1) [0-9] rakamlar
        2) [a-z] harfler
        3) [A-Z] büyük harfler
        4) [a-zA-Z] tüm harfler
        5) [a-zA-Z0-9] tüm harfler ve rakamlar
        6) \\p{Punct} noktalama işaretleri
        7) [aeiouAEIOU] sesli harfler
        8) [^a-z] tüm kucuk harfler haric
        9) [^a-zA-Z] tüm harflerden haric
        bir grup datayı değiştirmek için replace all metodu kullanılır
         */


        String replaceT= t.replaceAll("[0-9]","*");
        System.out.println("replaceT = " + replaceT);
    }

}
