package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //ie1: verilen cumlede kac kelime oldugunu gosteren kodu yaziniz

    String s = "Java is easy. Learn Java earn money";
    String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

    //ie2:verilen cumlede kac harf oldugunu gosterin
    String letters[]=s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);






    }
}
