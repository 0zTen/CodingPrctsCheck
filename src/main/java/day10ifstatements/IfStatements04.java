package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        System.out.println("Input an age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 0 && age <= 4) {
            System.out.println("Baby");
        } else if (age<= 12) {
            System.out.println("Child");
        } else if (age <= 20) {
            System.out.println("Adolescent");
        } else if (age <= 30) {
            System.out.println("Young Adult");
        } else if (age <= 65) {
            System.out.println("Adult");
        } else if (age <= 120) {
            System.out.println("Old");
        } else if (age >= 121) {
            System.out.println("Miracle");
        } else {
            System.out.println("Undefined");
        }
    /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/

    }
}
