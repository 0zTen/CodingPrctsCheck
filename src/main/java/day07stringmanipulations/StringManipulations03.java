package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
      //bir stringin bas ve sonunda spcae varsa siliniz
      /*  Scanner scan = new Scanner(System.in);
        String ex1;
        System.out.println("Giriniz");
        ex1= scan.nextLine();
        String ex1T = ex1.trim();
        System.out.println("ex1T = " + ex1T);
       */
        //ie2: asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv = "$456.99";
        String laptop = "$875.99";
        String tv2 = tv.replace("$","");
        String laptop2= laptop.replace("$","");
        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = $" + totalPrice);

        //ie3 verilen ismin ilk harfini ve soy isminin ilk harfini yazdirin
        String name= " ali cAN ";
        char editName= name.trim().toUpperCase().charAt(0);
        System.out.println("editName = " + editName);
        char editName02 =name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+editName + editName02);


    }
}
