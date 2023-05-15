package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        ie1:
        asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        1)en az 8 karakter olsun
        2)space characteri paswordde olmasin
        3)en az 1 uppercase olsun
        4)en az 1 kucuk harf olsun
        5)en az 1 rakam olsun
         */
        Scanner scan= new Scanner(System.in);
        String Password, UserName;
        System.out.println("Lutfen Kullanici adinizi giriniz");
        UserName = scan.nextLine();
        System.out.println("Lutfen passwordunuzu giriniz");
        Password= scan.nextLine();
        boolean Password1 = Password.length()>=8;
        System.out.println("Password1 = " + Password1);
        boolean Password2 = !Password.contains(" ");
        System.out.println("Password2 = " + Password2);
        boolean Password3 = Password.replaceAll("[^A-Z]","").length() >0;//method chain
        System.out.println("Password3 = " + Password3);
        boolean Password4 = Password.replaceAll("[^a-z]","").length() >0;
        System.out.println("Password4 = " + Password4);
        boolean Password5 = Password.replaceAll("[^0-9]","").length() >0;
        System.out.println("Password5 = " + Password5);
        System.out.println("Password Gecerli Mi? = " + (Password1 && Password2 && Password3 && Password4 && Password5));



    }



}
