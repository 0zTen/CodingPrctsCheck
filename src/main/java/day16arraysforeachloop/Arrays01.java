package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;
        //bu yapinin icinde sadece bir tane data depolanabilir.
        //ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilme icin java array yapisi olusturmustur

        //array nasil olusturulur
        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));
        //arrayler diger collectionlardan daha hizlidir ve daha az memory kaplar

        //arraye eleman ekleme
        stdNames[1] = "Ulaş";
        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[4]);


        //ie1: arraydeki her elemanin sonuna "!" isareti koyarak konsola yazdir
        //length stringlerde method(parantezli), arraylerde ise parantezsiz yazilir
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "*");

        }
















    }
}
